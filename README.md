# Parking Lot Application 

## Take Home Test

## How the Applications Work

The application is console-based which can be executed from the terminal. The general steps are as follows:

1. User can create the parking lot with its desired size.
2. Every car will get their own ticket for specific slot.
3. Driver must park their car in the specific slot.

More detailed information can be found on the program source code.

Main Focus:
* User can search cars that parked in the parking lot by their number plates or color.
* Program will automatically choose the nearest empty slot for newcomer. 

## Getting Started (How to Run the Program)

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites (How to set up your machine)

1. Navigate to the directory where is the root of this project folder.
2. Still in the directory where is the root of this project, install all its dependencies.

    ```bash
    mvn package
    ```

    Dependencies are all listed in `pom.xml`. To re-generate
    this file (after you've installed new packages), simply you can
    it directly on the file. If you have a problem installing the dependencies, 
    please install java system package first.

3. Run the app

    ```bash
    java -cp target/my-app-1.0-SNAPSHOT.jar com.herokuapp.parkour.App
    ```
6. The app is now running! To check that the app is actually running,
try to send an input file to it, for instance:

    ```bash
    java -cp target/my-app-1.0-SNAPSHOT.jar com.herokuapp.parkour.App < ${file_input}
    ```

    or type your own input `create_parking_lot 6` from your console. 
    You should get a response that says:

    ```bash
    Created a parking lot with 6 slots
    ```

### Installing (How to run the tests)

1. Make sure you already installed every system environment 
so if you didn't get the error about the system environment 
then they should already be installed.
2. You can run the tests with `mvn package` and
`mvn clean install` respectively.
3. For more information on what you can do with `mvn`, run
`mvn --help`.

## Built With

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java 8 SE SDK
* [Maven](https://maven.apache.org/) - Project dependency system for Java

## Important links
* [Maven](https://maven.apache.org/)
Language Used : Java 8 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)