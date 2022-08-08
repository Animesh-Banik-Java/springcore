package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Construc {
	public static void main(String[] args) { 
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/constructor/constuctorconfig.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.toString());
		System.out.println("------------------------------------------------------------------------------");
		
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	}

}
