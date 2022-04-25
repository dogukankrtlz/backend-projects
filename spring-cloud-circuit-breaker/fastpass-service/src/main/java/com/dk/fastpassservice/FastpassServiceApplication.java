package com.dk.fastpassservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FastpassServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastpassServiceApplication.class, args);
	}

}
