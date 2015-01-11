Updating the model
===
At this point the architecture and model of registration has been flushed out and we are ready to update it to what 
will actually be stored.  
 
![Registration Service](/src/main/resources/registration-service.jpg)   

![Robot](/src/main/resources/robot.jpg)   



###Building and running
Build the project:
`./gradlew build`

Run the application:
`java -jar build/libs/registration-0.0.3-SNAPSHOT.jar`

Add a robot:
`curl -i -X POST -H "Content-Type:application/json" -d '{  "name" : "Gruesome Twosome", "address" : "0.0.0.0" }' localhost:8080/robots`

Notice the new fields that we added if you GET the robot we just registered:
```json
{
  "name" : "Gruesome Twosome",
  "address" : "0.0.0.0",
  "dateRegistered" : "...",
  "robotId" : "...",
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/robots/..."
    }
  }
}
```
