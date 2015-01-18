Adding production features
===


###Building and running
Build the project:
`./gradlew build`

Run the application:
`java -jar build/libs/registration-0.0.4-SNAPSHOT.jar`

![Red Max](http://www.dan-dare.org/Dan%20FRD/CrimsonHaybailerAni.gif)   
[credit to dan-dare.org for the picture]

###New Endpoints
If you look at the log output from running the application, you will notice a bunch of new endpoints that were mapped automatically. Try out a few of them:   
* `curl localhost:8080/beans`   
* `curl localhost:8080/health`   
* The full list is [here](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#production-ready-endpoints)   

Now let's register another robot:
`curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "Red Max", "address" : "0.0.0.0" }' localhost:8080/register/robot`   

Since we registered a new counter metric in the `RobotController`, we can use the generated `/metrics` endpoint to make sure our registered robot was counted. Hitting the `/metrics` endpoint will give you all the metrics available:   
`curl localhost:8080/metrics`   

We can see here that our registered metric `counter.registration.register` has been incremented to 1.
