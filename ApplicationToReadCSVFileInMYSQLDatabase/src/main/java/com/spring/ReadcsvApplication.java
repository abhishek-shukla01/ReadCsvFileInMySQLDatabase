package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class ReadcsvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadcsvApplication.class, args);
	}

}
