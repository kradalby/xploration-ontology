# xploration-shared
Ontology for Xploration project in Agent Based Software development, EMSE 2016


## Installation
Remember to change the version number to the latest version. The latest version can be found under tags on Github.

### Gradle
Add or insert the following entries in your build.gradle file:

    repositories {
        maven { url "https://jitpack.io" }
    }

    dependencies {
        compile 'com.github.kradalby:xploration-shared:0.0.x'
    }

If you are using IntelliJ, remember to refresh gradle:

    View -> Tool Windows -> Gradle -> Refresh all Gradle projects


### Maven
Add or insert the following entries in your pom.xml file:

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependency>
        <groupId>com.github.kradalby</groupId>
        <artifactId>xploration-shared</artifactId>
        <version>0.0.x</version>
    </dependency>
