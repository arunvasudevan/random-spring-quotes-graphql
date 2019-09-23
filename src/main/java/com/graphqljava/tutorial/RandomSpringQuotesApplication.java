package com.graphqljava.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandomSpringQuotesApplication {

	private static final Logger log = LoggerFactory.getLogger(RandomSpringQuotesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RandomSpringQuotesApplication.class, args);
	}
}
