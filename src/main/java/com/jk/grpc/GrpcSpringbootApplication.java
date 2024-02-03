package com.jk.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcSpringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(GrpcSpringbootApplication.class, args);
		System.out.println("Spring Application Started...");
	}

}
