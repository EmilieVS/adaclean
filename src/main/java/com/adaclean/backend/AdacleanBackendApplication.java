package com.adaclean.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.adaclean.backend")
@EntityScan(basePackages = "com.adaclean.backend")
@EnableJpaRepositories(basePackages = "com.adaclean.backend")

public class AdacleanBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdacleanBackendApplication.class, args);
	}


}
