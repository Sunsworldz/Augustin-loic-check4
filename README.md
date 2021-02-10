# Augustin-loic-check4
**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html), [Angular], [mySql] and [Node.js](https://nodejs.org/).


## Getting Started Back

To install this application, run the following commands:

```bash
git clone https://github.com/Sunsworldz/Augustin-loic-check4
cd Augustin-loic-check4
```

This will get a copy of the project installed locally. To install all of its dependencies and start each app, follow the instructions below.

The back api is build for postgreSql, build the 'apiCheckPoint' with Maven  then edit in application properties:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/portofolio?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username=YOUR USER
spring.datasource.password=YOUR PASSWORD
```

To run the api rest, cd into the `apiCheckPoint` folder and run:
 
```bash
./mvnw spring-boot:run
```

The table creation is done by spring data JPA using the entities values.

Add some entries for testing with this script


## Getting Started Front
To run the client interface, cd into the `front` folder and run:
 
```bash
npm install
```
And then open it (port is set on 4201)

```bash
ng serve -o
```

