package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Standalone {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext con = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/standalone/collection/standaloneconfig.xml");
		Person pson = con.getBean("person",Person.class);
		System.out.println(pson.getFriends());
		System.out.println(pson.getFriends().getClass().getName());
		System.out.println("--------------------------------------------------------------------");
		System.out.println(pson.getFees());
		System.out.println(pson.getFees().getClass().getName());
		System.out.println("--------------------------------------------------------------------");
		System.out.println(pson.getProps());
		System.out.println(pson.getProps().getClass().getName());
		
		
	}

}

