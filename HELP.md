# Getting Started

Project based on Sprint Boot tutorial:
https://www.youtube.com/watch?v=9SGDpanrc8U&t=772s

Links used:
https://www.jetbrains.com/idea/
https://www.enterprisedb.com/downloads/postgres-postgresql-downloads

GET request
http://localhost:8080/api/v1/student

POST request
http://localhost:8080/api/v1/student
{"name":"Miles","dob":"2009-06-15","email":"miles@test.com"}

DELETE request
http://localhost:8080/api/v1/student/3

PUT request
http://localhost:8080/api/v1/student/3?email=jim@test.com

Run package
$ pwd
/c/jimmy/github-jimmy-chr/spring-boot-demo/target
$ java -jar demo-0.0.1-SNAPSHOT.jar



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

