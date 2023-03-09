package com.example.bibliotecaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
@EnableDiscoveryClient
public class BibliotecaServiceApplication {

	public static void main (String[] args) {
		SpringApplication.run(BibliotecaServiceApplication.class, args);
	}

}
