package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@ComponentScan("com") because we used Respository and Service annotation instead of it
//@EntityScan("com")

/*
 * 
 * @SpringBootApplication
Purpose: A convenience annotation that combines several other annotations commonly used in Spring Boot applications.
Usage: Marks the main class of a Spring Boot application.
Package: From org.springframework.boot.autoconfigure.
Combined Annotations


@SpringBootApplication combines the following annotations:

@EnableAutoConfiguration: 

Enables Spring Boot’s auto-configuration mechanism, 
which automatically configures your Spring application based on the dependencies you have added.

@ComponentScan:
 Enables component scanning, allowing Spring to automatically detect and register beans (components) in the 
 specified package and its sub-packages.
 
@Configuration: Indicates that the class can be used by the Spring IoC container as a source of bean definitions.
 * 
 * 
 * 
 * */
public class SpringCricketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCricketApplication.class, args);
	}

}
