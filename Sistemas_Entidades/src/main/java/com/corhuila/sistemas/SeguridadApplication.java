package com.corhuila.sistemas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class SeguridadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguridadApplication.class, args);
	}

}
