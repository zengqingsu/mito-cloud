package com.zqs.mitozipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class MitoZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(MitoZipkinApplication.class, args);
	}

}

