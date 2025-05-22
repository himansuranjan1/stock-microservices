package com.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class StockCalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockCalApiApplication.class, args);
	}

}
