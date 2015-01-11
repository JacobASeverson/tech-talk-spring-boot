Changing The App's Configuration
===
* Split out Mongo to its own config class and configured the database.

###Building and running
Build the project:
`./gradlew build`

Run the application:
`java -jar build/libs/registration-0.0.4-SNAPSHOT.jar`

![Red Max](http://www.dan-dare.org/Dan%20FRD/CrimsonHaybailerAni.gif)   
[credit to dan-dare.org for the picture]


Register a robot:
`curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "Red Max", "address" : "0.0.0.0" }' localhost:8080/register/robot`
