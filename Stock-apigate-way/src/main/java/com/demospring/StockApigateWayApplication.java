package com.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class StockApigateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockApigateWayApplication.class, args);
	}

}
