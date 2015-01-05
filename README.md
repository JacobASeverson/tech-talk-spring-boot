Switching To MongoDB
===
TODO

###Building and running
Build the project:
`./gradlew build`

Run the application:
`java -jar build/libs/registration-0.0.4-SNAPSHOT.jar`


Register a robot:
`curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "Dick Dastardly8", "address" : "127.0.0.1" }' localhost:8080/register/robot`
