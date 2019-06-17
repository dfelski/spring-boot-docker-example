# Spring Boot Example

Simple Spring Boot controller packed in a Docker container.  


## Run it
If you have a Java Runtime installed just use gradle 
```
./gradlew clean test bootRun
```

You can use Docker as an alternative to build and run the example
```
docker build -t test/spring-boot-example . && docker run -it --rm -p 8080:8080 test/spring-boot-example
```

## Test it
Just send a HTTP GET request to ``http://localhost:8080`` to see an output

```
curl http://localhost:8080
curl http://localhost:8080/someValue
```
