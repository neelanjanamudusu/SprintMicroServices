package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DeleteAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeleteAddressApplication.class, args);
	}

}
