package com.eurekaCommonJwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaCommonJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCommonJwtApplication.class, args);
	}

}
