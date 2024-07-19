package com.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springcore.component.Student;
@Configuration
@ComponentScan(basePackages=("com.mypack"))
public class MyConfig {
	@Bean("Student1")
	public Student getStudentBean() {
		System.out.println("This first bean");

		return new Student("Creating First Bean");
	}
	@Bean("Student2")
	public Student getStudentNewBean() {
		System.out.println("This Second bean");

		return new Student("Creating Second Bean");
	}
}
