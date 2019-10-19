package com.sgic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.sgic.service"})
//@EntityScan("com.sgic.entity")
//@EnableJpaRepositories("com.sgic.repository")
public class DefectTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefectTrackerApplication.class, args);
	}

}
