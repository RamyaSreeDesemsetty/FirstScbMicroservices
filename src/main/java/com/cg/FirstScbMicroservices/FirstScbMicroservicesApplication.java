package com.cg.FirstScbMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableEurekaClient
public class FirstScbMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstScbMicroservicesApplication.class, args);
	}

}
