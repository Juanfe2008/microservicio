package com.example.gateaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateawayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateawayApplication.class, args);
	}

}
