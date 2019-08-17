package com.mongodb.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MongoDbRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbRestApiApplication.class, args);
	}

}
