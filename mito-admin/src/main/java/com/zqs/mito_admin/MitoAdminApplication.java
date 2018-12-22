package com.zqs.mito_admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
@EnableTurbineStream
public class MitoAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MitoAdminApplication.class, args);
	}

}

