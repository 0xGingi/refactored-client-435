# RuneJS Java Client #435

A RuneScape game client from October 2006 which has been modified to work with RuneJS, a RuneScape game server written in NodeJS and TypeScript. **This client is not for OldSchool RuneScape** - client #435 pre-dates the very first OSRS client by quite some time. 

We've no interest in OSRS client hacking, this client exists as a means to develop on RuneJS game servers and will not work with other server emulators.

## Usage

Running the client can be done either with the pre-built client JAR file or by building the Java code and running it manually in an IDE.

### Pre-Built Client

Running the pre-built client requires having Java installed: https://www.java.com/en/

Once installed, Download the jar from Releases and simply double-click the JAR file to run it. Alternatively if executing the JAR does not work, use the command `java -jar 0xRS.jar` .


### Gradle

Gradle provides a wrapper script which downloads the build system to a local cache. This allows you to run the client
without the help of an IDE such as IntelliJ. Gradle is also configured to automatically download dependencies.

The following examples use the unix executable `./gradlew`, however Windows can replace these with `./gradlew.bat`.

**Running via Gradle**

The `application` gradle plugin provides the `run` task, which starts up the Main client class. With this option,
arguments can be provided via `--args`.

```
./gradlew run
```

**Building a Jar**

The `jar` task can be used to build a jar, which is generated in the `build/libs` directory.

```
./gradlew jar
java -jar ./build/libs/client-435-0.3.jar
```
