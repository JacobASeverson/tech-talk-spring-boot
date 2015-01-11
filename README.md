Starting with CRUD
===

###Creating a project
Two ways to quickly set up a Spring Boot project:  
1) With the [Spring Boot CLI](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started-installing-the-cli) (easy installation with GVM). The command that created this project:  
   
   `spring init -d=data-rest,data-jpa --build=gradle tech-talk-spring-boot`  

2) Using the [Spring Initializr Application](http://start.spring.io/) to generate your Gradle build file.

###Building and running
Build the project:
`./gradlew build`

Run the application:
`java -jar build/libs/registration-0.0.1-SNAPSHOT.jar`

Hit the application:
`curl localhost:8080`

Hit the robots resource that we set up:
`curl localhost:8080/robots`

![Dick Dastardly](http://www.dan-dare.org/Dan%20FRD/MeanMachineAni.gif)   
[credit to dan-dare.org for the picture]

Add a robot:
`curl -i -X POST -H "Content-Type:application/json" -d '{  "name" : "Dick Dastardly" }' localhost:8080/robots`

Check out the robot we just created:
`curl localhost:8080/robots`
