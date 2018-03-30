#!/bin/bash
file_input=$1
mvn package
java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App < ${file_input}