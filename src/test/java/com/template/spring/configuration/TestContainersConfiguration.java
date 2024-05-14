package com.template.spring.configuration;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class TestContainersConfiguration {

    @Bean
    @ServiceConnection
    @RestartScope
    public PostgreSQLContainer<?> postgreSQLContainer() {
        // You can create a startup script for populating the DB by creating a
        // `init.sql` file in the test/resources dir
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"))
        //        .withInitScript("init.sql")
        ;
    }
}
