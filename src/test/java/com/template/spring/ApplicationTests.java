package com.template.spring;

import com.template.spring.configuration.TestContainersConfiguration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestContainersConfiguration.class)
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
