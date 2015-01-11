Changing The App's Configuration
===
Sooner or later we will need to externalize some of the configuration so we can run the same code in different environments.

###Configuration updates
1. Create a seperate config class for MongoDB and wire up the parts necessary.
2. Create an `application.properties` file where config values can be externalized.

###Building and running
Build the project:
`./gradlew build`

Run the application:
`java -jar build/libs/registration-0.0.5-SNAPSHOT.jar`

Register a robot:
`curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "Penelope Pitstop", "address" : "127.0.0.1" }' localhost:8080/register/robot`

> **Note**: notice now our robots are saved to a `Registration` DB.
