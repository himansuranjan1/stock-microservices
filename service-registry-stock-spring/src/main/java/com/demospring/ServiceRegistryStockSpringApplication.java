package com.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryStockSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryStockSpringApplication.class, args);
	}

}
