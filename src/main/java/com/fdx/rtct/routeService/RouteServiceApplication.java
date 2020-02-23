package com.fdx.rtct.routeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RequestMapping
public class RouteServiceApplication {
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		System.out.println("--allocation started-----");
		SpringApplication.run(RouteServiceApplication.class, args);
	}
	
	
	
}
