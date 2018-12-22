package com.zqs.mitoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MitoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MitoEurekaApplication.class, args);
	}

}

