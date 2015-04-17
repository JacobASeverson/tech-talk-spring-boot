Erste Schritte mit CRUD
===

### Ein Projekt anlegen
Ein Spring Boot Projekt kann schnell auf zweierlei Weisen angelegt werden: 
1) Man verwendet [Spring Boot CLI](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started-installing-the-cli) (Eine einfache Installation mittels GVM). Dieses Projekt wurde mit dem nachstehenden Kommando erstellt:  
   
   `spring init -d=data-rest,data-jpa --build=gradle tech-talk-spring-boot`  

2) Oder man nutzt die [Spring Initializr Application](http://start.spring.io/), um das Gradle build file zu ersellen.

###Erstellung und Laufen lassen
Gebaut wird das Projekt mittels:
`./gradlew build`

Gestartet wird über:
`java -jar build/libs/registration-0.0.1-SNAPSHOT.jar`

Mittels curl kann man nach dem Starten mit der Anwendung Kontakt aufnehmen z.B.:
`curl localhost:8080`

Anzeigen aller registrierten Roboter:
`curl localhost:8080/robots`

![Dick Dastardly](http://www.dan-dare.org/Dan%20FRD/MeanMachineAni.gif)   
[Bildautor: dan-dare.org]

Einen weiteren Roboter registrieren:
`curl -i -X POST -H "Content-Type:application/json" -d '{  "name" : "Dick Dastardly" }' localhost:8080/robots`

Die Daten zu einem Roboter mit einer bestimmten id (1, 2, 3 u.s.w.) abfragen:
`curl localhost:8080/robots/<id>`

