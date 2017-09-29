/*
 * Copyright (C) 2017 Raymond
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package sandbox;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Raymond
 */
public class EgisTestTest {
    
    public EgisTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of getJsonFormat method, of class EgisTest.
     */
    @Test
    public void testGetJsonFormat() {
        System.out.println("getJsonFormat");
        EgisTest instance = new EgisTest();
        assertEquals("{\"Programming Stack\":[{\"Tech\":\"Java 8 / JVM\", \"Reason\":\" \", \"Lifecycle\":\" \" },{\"Tech\":\"Groovy\", \"Reason\":\" Developer friendly especially for scripting, XML and JSON\", \"Lifecycle\":\" \" },{\"Tech\":\"Egis Kernel\", \"Reason\":\" Created before CDI and friends were released, Migrate to CDI API - To consider migration to full CDI kernel.\", \"Lifecycle\":\" \" },{\"Tech\":\"Hibernate / JPA\", \"Reason\":\" Need to support multiple DB platforms\", \"Lifecycle\":\" \" },{\"Tech\":\"Jetty\", \"Reason\":\" Easily embeddable\", \"Lifecycle\":\" \" },{\"Tech\":\"Hazelcast\", \"Reason\":\" Easily embeddable, more activity than JGroups\", \"Lifecycle\":\" \" },{\"Tech\":\"PostgreSQL / MySQL / SQL Server\", \"Reason\":\" 3 most common db platforms\", \"Lifecycle\":\" \" },{\"Tech\":\"Lucene\", \"Reason\":\" Easily embeddable, supports single node and custom filters for advanced ACL's\", \"Lifecycle\":\" \" },{\"Tech\":\"TestNG\", \"Reason\":\" Better support for listeners, ignores etc.\", \"Lifecycle\":\" \" },{\"Tech\":\"C#\", \"Reason\":\" Most widely used and supported language for deskop apps\", \"Lifecycle\":\" \" },{\"Tech\":\"Golang\", \"Reason\":\" A better alternative to C and C++\", \"Lifecycle\":\" \" },{\"Tech\":\"Python\", \"Reason\":\" Developer friendly, available by default on Ubuntu\", \"Lifecycle\":\" \" },{\"Tech\":\"Markdown\", \"Reason\":\" Ease of onboarding / migration between platforms - Easily diffable for PR's\", \"Lifecycle\":\" \" },{\"Tech\":\"Gitbook\", \"Reason\":\" Most mature, open source platform - Outgrew MkDocs\", \"Lifecycle\":\" \" },{\"Tech\":\"ES6 / Babel\", \"Reason\":\" Coffeescript is on life support, Typescript support for duck typing, importing plugins etc is more limited\", \"Lifecycle\":\" \" },{\"Tech\":\"NPM\", \"Reason\":\" Migrated to yarn\", \"Lifecycle\":\" EOL\" },{\"Tech\":\"Yarn\", \"Reason\":\" Faster and more progressive than NPM 4/5\", \"Lifecycle\":\" \" },{\"Tech\":\"Gulp\", \"Reason\":\" Faster than grunt with better and more up to date plugins\", \"Lifecycle\":\" \" },{\"Tech\":\"Selenium/Webdriver\", \"Reason\":\" For E2E tests - Use with caution\", \"Lifecycle\":\" \" },{\"Tech\":\"Karma / Jasmine\", \"Reason\":\" \", \"Lifecycle\":\" \" },{\"Tech\":\"ExtJS\", \"Reason\":\" Lack of backwards compatibility, unfriendly licensing for app builders\", \"Lifecycle\":\" EOL\" },{\"Tech\":\"Angular (1 or 2)\", \"Reason\":\" Too complex to learn / debug - Lack of backwards compatibility: Vue or React are better options\", \"Lifecycle\":\" EOL\" },{\"Tech\":\"Vue.js\", \"Reason\":\" To test and consider - values align to our culutral manifesto - primarily KISS\", \"Lifecycle\":\" Future\" },{\"Tech\":\"WebComponents / Polymer 2.0\", \"Reason\":\" Standards compliant, but the ecosystem is not very large yet\", \"Lifecycle\":\" Future\" },{\"Tech\":\"React\", \"Reason\":\" Very large ecosystem - but perhaps to heavyweight\", \"Lifecycle\":\" Future\" }]\n"
            + ",\"Build Stack\":[{\"Tech\":\"Gradle\", \"Use\":\" \", \"Reason\":\" Supports everything maven does, but is more customizble/plugable while also being less verbose\", \"Lifecycle\":\" \" },{\"Tech\":\"Ant\", \"Use\":\" \", \"Reason\":\" Aging technology, but still works ok - migrate to gradle/npm when any serious dev occurs\", \"Lifecycle\":\" EOL\" },{\"Tech\":\"Babel / Gulp\", \"Use\":\" \", \"Reason\":\" \", \"Lifecycle\":\" \" },{\"Tech\":\"npm\", \"Use\":\" javascript artificact repository\", \"Reason\":\" \", \"Lifecycle\":\" \" },{\"Tech\":\"Github\", \"Use\":\" Code repository, review, documentation hosting\", \"Reason\":\" \", \"Lifecycle\":\" \" },{\"Tech\":\"CircleCI\", \"Use\":\" Primary build environment\", \"Reason\":\" Cheaper then Travis CI - Supports MacOSX\", \"Lifecycle\":\" \" },{\"Tech\":\"AppVeyor\", \"Use\":\" Build server for windows based projects\", \"Reason\":\" Only SaaS CI with windows support\", \"Lifecycle\":\" \" },{\"Tech\":\"Jenkins\", \"Use\":\" Build server for old client projects\", \"Reason\":\" Limited support for autoscaling - requires non trivial maintenance of slaves, Migrate to CircleCI\", \"Lifecycle\":\" EOL\" },{\"Tech\":\"Codacy\", \"Use\":\" Code linting\", \"Reason\":\" Support for Java and JS\", \"Lifecycle\":\" \" },{\"Tech\":\"Codecov\", \"Use\":\" Code coverage\", \"Reason\":\" Migrate to codacy to unify quality metrics\", \"Lifecycle\":\" EOL\" },{\"Tech\":\"Amazon S3\", \"Use\":\" Artifact repo\", \"Reason\":\" S3 is dependency free and low cost with +- 1GB per day of artifacts\", \"Lifecycle\":\" \" },{\"Tech\":\"Nexus / JFrog\", \"Use\":\" Artifact repo\", \"Reason\":\" To consider as a addon / replacement to S3\", \"Lifecycle\":\" Future\" }]\n"
            + ",\"Infrastructure\":[{\"Infrastructure\":\"Ubuntu LTS\", \"Use\":\" Server OS\", \"\":\" \" },{\"Infrastructure\":\"Docker\", \"Use\":\" Used in builds and dev/test environments - being assessed for production usage\", \"\":\" \" },{\"Infrastructure\":\"PostgreSQL\", \"Use\":\" SaaS primary database due to better data integrity and friendlier licensing\", \"\":\" \" },{\"Infrastructure\":\"ansible\", \"Use\":\" cluster management and local machine environment\", \"\":\" \" },{\"Infrastructure\":\"VMWare ESXi\", \"Use\":\" Virtualization provider\", \"\":\" \" },{\"Infrastructure\":\"VMWare vCenter\", \"Use\":\" Appliance proved very unreliable, esx-cli replicates 90% of functions\", \"\":\" EOL\" },{\"Infrastructure\":\"Amazon EC2\", \"Use\":\" DR 'site' - we spin up, deploy and restore backups from S3\", \"\":\" \" },{\"Infrastructure\":\"Amazon S3\", \"Use\":\" Backups for both blobs and database backups. 1 bucket per tenant/client\", \"\":\" \" },{\"Infrastructure\":\"Amazon DynomoDB\", \"Use\":\" Basic storage of tenants, used in DR to know which clients to restore\", \"\":\" \" },{\"Infrastructure\":\"Cloudflare\", \"Use\":\" There are local DNS and cache edge servers, Upgradability to WAF is nice to have\", \"\":\" \" },{\"Infrastructure\":\"Google Drive\", \"Use\":\" WIP specs, on project completion docs should be archived to PT\", \"\":\" \" },{\"Infrastructure\":\"Sendgrid\", \"Use\":\" SMTP server\", \"\":\" \" },{\"Infrastructure\":\"Google Apps\", \"Use\":\" Email (IMAP/POP) provider\", \"\":\" \" },{\"Infrastructure\":\"Hipchat\", \"Use\":\" Team chatrooms - Migrating to Slack\", \"\":\" EOL\" },{\"Infrastructure\":\"Slack\", \"Use\":\" \", \"\":\" NEW\" },{\"Infrastructure\":\"Trello\", \"Use\":\" High level dev and sales tracking\", \"\":\" \" },{\"Infrastructure\":\"Fortigate\", \"Use\":\" Firewall and IPS - Reasonable prices, Out of the box HA and VPN\", \"\":\" \" },{\"Infrastructure\":\"Dell\", \"Use\":\" Reasonable prices, especially for HDD's, iDRAC works fairly well\", \"\":\" \" },{\"Infrastructure\":\"Docker Hub\", \"Use\":\" Hosting of docker images\", \"\":\" \" }]\n"
            + ",\"Monitoring\":[{\"Tech\":\"Dripstat\", \"Use\":\" JVM and transaction monitoring\", \"Reason\":\" Provides free monitoring for small JVM's and stepped levels for higher.\" },{\"Tech\":\"Plumbr\", \"Use\":\" JVM and transaction monitoring\", \"Reason\":\" EOL, Root cause of 2 - 3 downtime events, inflexible pricing\" },{\"Tech\":\"Newrelic\", \"Use\":\" Server monitoring\", \"Reason\":\" EOL\" },{\"Tech\":\"Pagerduty\", \"Use\":\" \", \"Reason\":\" \" },{\"Tech\":\"Nodegrid\", \"Use\":\" Website monitoring\", \"Reason\":\" \" },{\"Tech\":\"health dashboard\", \"Use\":\" Health tracking of servers, network devices and apps\", \"Reason\":\" Nagios and similar tools are complex and difficult to setup &amp; maintain / SaaS tools are expensive when you get to many small endpoints to track\" }]\n"
            + "}", instance.getJsonFormat());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
