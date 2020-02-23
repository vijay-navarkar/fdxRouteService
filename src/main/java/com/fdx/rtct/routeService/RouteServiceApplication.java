package com.fdx.rtct.routeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@RequestMapping
public class RouteServiceApplication {
	
	public static void main(String[] args) {
		System.out.println("--allocation started-----");
		SpringApplication.run(RouteServiceApplication.class, args);
	}
	
	@RequestMapping(path = "/method2" , method = RequestMethod.GET )
	public String method(){
		return "Scan Test Controller 2";
		
	}
	
	
}
