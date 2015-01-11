Exposing the service
===
Time to strip out the CRUD services and expose an endpoint for robots to register with.

###The API
####/register/robot
POST   
*Request Headers*:   

| Header | Value |
|------|------|
| Content-Type | application/json |

*Request Body*:

| Field   | Description                                    |
|---------|------------------------------------------------|
| name    | The name of the robot                          |
| address | The IP address currently assigned to the robot |

###Updating the services
1. Make sure to remove `org.springframework.boot:spring-boot-starter-data-rest` from the build file, otherwise those Restful services will still get configured.
2. Add the  `org.springframework.boot:spring-boot-starter-web` starter.
3. Create a `@RestController` to expose the `/register/robot` endpoint.

###Building and running
Build the project:
`./gradlew build`

Run the application:
`java -jar build/libs/registration-0.0.4-SNAPSHOT.jar`

Register a robot:
`curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "Prof Pat Pending", "address" : "127.0.0.1" }' localhost:8080/register/robot`
