package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"controller", "config","model","entity","reponsitory","services"})
@EntityScan("entity")
@EnableJpaRepositories("reponsitory")
public class FinalProjectJava1Application {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectJava1Application.class, args);
	}

}
