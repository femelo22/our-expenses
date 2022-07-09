package com.lfmelo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OurExpensesApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(OurExpensesApplication.class, args);
	}

}
