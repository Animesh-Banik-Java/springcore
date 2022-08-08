package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowirings {

	@SuppressWarnings("resource")
	public static void main(String[] args) { 
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/autowiring/annotation/autowiringconfig.xml");
		Emp emp = (Emp) context.getBean("emp"); 
		System.out.println("Result from setter: "+emp.toString()); 
	}

}
