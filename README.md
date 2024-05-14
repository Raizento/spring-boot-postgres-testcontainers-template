# Spring Boot template application

This project serves as a template for creating a project with
- Spring Boot
- HATEOAS
- Data JPA
- Testcontainers
- PostgresSQL
- Lombok
- Devtools

As such, it is a nice starting point for projects with the goal
of serving a REST API and persisting information in a PostgresSQL DB.

Integration testing can be done by using the supplied TestContainer configuration.

To hot-reload the server when running, you need to run `./gradlew compileJava` while
another `gradle` instance is running `bootTestRun`. [Source](https://www.docker.com/blog/spring-boot-application-testing-and-development-with-testcontainers/)
