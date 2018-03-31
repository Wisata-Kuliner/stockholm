#!/bin/bash
file_input=$1
mvn package
mvn clean install
if [[ -n "$file_input" ]]; then
	java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App < ${file_input}
else
	java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
fi