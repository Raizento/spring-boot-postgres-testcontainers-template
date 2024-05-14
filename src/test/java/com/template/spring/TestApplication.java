package com.template.spring;

import com.template.spring.configuration.TestContainersConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;

@TestConfiguration(proxyBeanMethods = false)
@Import(TestContainersConfiguration.class)
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestApplication.class).run(args);
	}

}
