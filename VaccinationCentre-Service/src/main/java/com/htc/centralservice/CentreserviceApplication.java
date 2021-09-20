package com.htc.centralservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CentreserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentreserviceApplication.class, args);
	}

}
