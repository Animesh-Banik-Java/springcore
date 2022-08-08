package com.springcore.config;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

@Configuration 
public class JavaConfig {
	private Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(new Samosa());
		return student;
	}
	 
	
}
