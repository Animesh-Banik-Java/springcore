package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Callects {

	public static void main(String[] args) { 
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/collection/collectionconfig.xml");
		Emp emp = (Emp)context.getBean("emp");
		System.out.println("Hello Animesh");
		System.out.println(emp.toString());
		System.out.println(emp.getProps().toString());
		

	}

}
