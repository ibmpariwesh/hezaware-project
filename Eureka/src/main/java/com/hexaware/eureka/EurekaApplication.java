package com.hexaware.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

import com.netflix.discovery.shared.Application;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(EurekaApplication.class, args);
//		SpringApplication.run(EurekaApplication.class, args);
	}
}
