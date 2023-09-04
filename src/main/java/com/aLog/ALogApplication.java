package com.aLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class ALogApplication {
	public static void main(String[] args) {
		SpringApplication.run(ALogApplication.class, args);
	}

}
