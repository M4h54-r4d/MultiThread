package com.Isc.MultiThread; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class MultiThreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiThreadApplication.class, args);
	}

}
