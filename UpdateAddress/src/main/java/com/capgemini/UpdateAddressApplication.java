package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class UpdateAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateAddressApplication.class, args);
	}

}
