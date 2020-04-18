package com.self.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InitiatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitiatorApplication.class, args);
	}

}
