package com.example.FirstMSClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
public class FirstMsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMsClientApplication.class, args);
	    System.out.println("get eureka server");
	}

}
