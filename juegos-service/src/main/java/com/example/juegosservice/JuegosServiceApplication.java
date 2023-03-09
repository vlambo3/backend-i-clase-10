package com.example.juegosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JuegosServiceApplication {

	public static void main (String[] args) {
		SpringApplication.run(JuegosServiceApplication.class, args);
	}

}
