Archive Statement:

As of March 2019, this repository is read-only as Salesforce has archived the Aura open-source UI framework. Aura components will continue to be supported, but the project is no longer open source.

Salesforce has introduced a new programming model for the Lightning Component Framework called [Lightning Web Components](https://trailhead.salesforce.com/en/content/learn/projects/quick-start-lightning-web-components). This programming model is designed for building fast components using modern JavaScript and Web Standards. Lightning web components and Aura components can coexist and interoperate on a page.


* To learn more about Aura components, start with the [Aura Components Basics](https://trailhead.salesforce.com/en/content/learn/modules/lex_dev_lc_basics) module in Trailhead.
* For more details, see the [Lightning Aura Components Developer Guide](https://developer.salesforce.com/docs/atlas.en-us.lightning.meta/lightning/).


Old ReadMe:

What is Aura?
Aura is a UI framework for developing dynamic web apps for mobile and desktop devices, while providing a scalable long-lived lifecycle to support building apps engineered for growth. It supports partitioned multi-tier component development that bridges the client and server.

To find out more about Aura, see the Aura Documentation site.

How Do I Develop with Aura?
You can build your user interface at a granular level and easily integrate with popular toolkits and libraries, such as jQuery. Aura's lightweight and scalable architecture uses two key building blocks: components and events.

Components use markup that looks similar to HTML. You can also use HTML or any other code that can execute within an HTML page. Components are encapsulated and their internals stay private. You can extend existing components to customize their behavior.

The robust event model enables you to develop loosely coupled components. Once you define the events that interact with your components, your team can work on the components in parallel to quickly build a powerful app.

Aura also supports a powerful expression language, embedded testing, performance, and security features.

How Do I Start?
The easiest way to get up and running is from the command line, but you can easily use Aura with your favorite IDE too.

Prerequisites
You need:

JDK 1.8
Apache Maven 3
Step 1: Generate a Template from the Aura Archetype
Open a command line window.

Navigate to the directory where you want to create your project template and run:

mvn archetype:generate -DarchetypeCatalog=http://repo.auraframework.org/libs-release-local/archetype-catalog.xml

When prompted to choose an archetype, enter 1.

Select the latest archetype version, or press enter for the default version. The archetype is downloaded to your machine.

Enter these values:


    Define value for property 'groupId': org.myGroup
    Define value for property 'artifactId': helloWorld
    Define value for property 'version': 1.0-SNAPSHOT
    Define value for property 'package': org.myGroup
**Note**: The artifactId can only contain alphanumeric characters.
When prompted to confirm properties configuration, enter Y. The following output confirms that your template has been generated successfully.

    [INFO] ----------------------------------------------------------------------------
    [INFO] Using following parameters for creating project from Archetype: aura-archetype:0.0.1-SNAPSHOT
    [INFO] ----------------------------------------------------------------------------
    [INFO] Parameter: groupId, Value: org.myGroup
    [INFO] Parameter: artifactId, Value: helloWorld
    [INFO] Parameter: version, Value: 1.0-SNAPSHOT
    [INFO] Parameter: package, Value: org.myGroup
    [INFO] Parameter: packageInPathFormat, Value: org.myGroup
    [INFO] Parameter: package, Value: org.myGroup
    [INFO] Parameter: version, Value: 1.0-SNAPSHOT
    [INFO] Parameter: groupId, Value: org.myGroup
    [INFO] Parameter: artifactId, Value: foo
    [INFO] project created from Archetype in dir: /home/
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 33.656s
    [INFO] Finished at: Tue Jul 16 14:39:07 PST 2013
    [INFO] Final Memory: 10M/180M
    [INFO] ------------------------------------------------------------------------
Step 2: Build and Run Your Project
On the command line, navigate to the directory for your new app.

cd helloWorld

Build the app.

mvn clean install

Start the Jetty server on port 8080.

mvn jetty:run

To use another port, append: -Djetty.port=portNumber. For example, mvn jetty:run -Djetty.port=9877.

Test your app in a browser by navigating to:

http://localhost:8080/helloWorld/helloWorld.app
You should see a simple greeting in your browser.

To stop the Jetty server and free up the port when you are finished, press CTRL+C on the command line.

Note: the helloWorld/pom.xml file has a <dependencies> section, which lists the <version> of each Aura artifact in your project. They define the version of Aura that your project is using and each artifact should use the same version.

Next Steps
Now that you've created your first app, you might be wondering where do I go from here? There is much more to learn about Aura. Here are a few ideas for next steps.

Read the Documentation
See the Aura Documentation site.

Alternatively, you can start up your Jetty server and navigate to http://localhost:8080/auradocs/docs.app to access the documentation on your localhost.
