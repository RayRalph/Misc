
/**
 *
 * @author Raymond
 */
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EgisTest {
    static final Logger LOGGER = Logger.getLogger(EgisTest.class.getName());
    
    private static final String REPLACETAGS = "\\<.*?\\> ?";
    
    public static void main(String[] args) {
        EgisTest et = new EgisTest();
        et.getJsonFormat();
    }
    /**
     * this method generates the JSON format from the page data provided by the URL.
     * It will then output it to the STOUT
     */
    public void getJsonFormat() {
        String contents = getURLContent("https://github.com/egis/handbook/blob/master/Tech-Stack.md");
        int occ = occurs(contents, "/table");
        StringBuilder builder = new StringBuilder("{");
        for(int i = 0; i < occ; i++){
            if(i > 0){
                builder.append(",");
            }
            builder.append("\"").append(getElementHeading(contents)).append("\":")
                    .append(joinContent(getDataHeader(contents), recurData(contents.substring(0, contents.indexOf("</table>"))))).append("\n");
            contents = contents.substring(contents.indexOf("</table>")+8);
            
        }
        builder.append("}");
        LOGGER.log(Level.INFO, builder.toString(), builder.toString());
    }
    /**
     * get the page content from the URL
     * @param theURL
     * @return 
     */
    private String getURLContent(String theURL) {
        URL u;
        InputStream is = null;
        DataInputStream dis;
        String s;
        StringBuilder sb = new StringBuilder();
            
        try {
            u = new URL(theURL);
            is = u.openStream();
            dis = new DataInputStream(new BufferedInputStream(is));
            while ((s = dis.readLine()) != null) {
                sb.append(s);
            }
        } catch (MalformedURLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }finally {
            try {
                is.close();
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
            }
        }
        String content = sb.toString();
        String article = "<article class=\"markdown-body entry-content\" itemprop=\"text\">";
        return content.substring(content.indexOf(article)+ article.length(), content.indexOf("</article"));
    }
    
    private String getElementHeading(String table){
        return table.substring(table.indexOf("</a>") + 4, table.indexOf("</h2>")).replaceAll(REPLACETAGS, "");
    }
    private String getDataHeader(String data){
        return data.substring(data.indexOf("<th>")+4, data.indexOf("</th></tr>")).replace("</th><th>", "| ");
    }
    private String getTableData(String data){
        String tdata = data.substring(data.indexOf("<td>")+4, data.indexOf("</td></tr>"))
                .replace("<div>", "").replace("</div>", "");
        return tdata.replace("</td><td>", "~ ");
    }
    /**
     * this method joins the HTML table header to the table data per row
     * @param dataHeader
     * @param tableData
     * @return 
     */
    private String joinContent(String dataHeader, List<String> tableData){
        String [] headArr = dataHeader.split("[|]");
        StringBuilder builder = new StringBuilder("[");
        for (String data : tableData) {
            String [] dataArr = data.split("[~]");
            if(headArr.length != dataArr.length ){
                break;
            }
            builder.append("{");
            for(int i = 0; i < dataArr.length; i++){
                builder.append("\"").append(headArr[i].replaceAll(REPLACETAGS, "").trim())
                        .append("\":\"").append(dataArr[i].replaceAll(REPLACETAGS, "").replace("\"", "'"))
                        .append("\", ");
            }
            builder.deleteCharAt(builder.length()-2).append("},");
        }
        builder.deleteCharAt(builder.length() - 1).append("]");
        return builder.toString();
    }
    /**
     * build up a data list from the HTML string
     * @param content
     * @return 
     */
    private List<String> recurData(String content){
        int occ = occurs(content, "<tr>");
        List<String> tableData = new ArrayList<>();
        String first = null;
        for(int i = 0; i < occ; i ++){
            String last = getTableData(content);
            if(null == first || !first.equals(last)){
                tableData.add(last);
                first = last;
            }
            content = content.substring(content.indexOf("</tr>") + 5);
        }
        return tableData;
    }
    
    /**
     * This method counts the occurences that a character sequence appears in a string
     * @param content
     * @param findStr
     * @return 
     */
    private int occurs(String content, String findStr){
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = content.indexOf(findStr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        return count;
    }
}
