package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ref {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a.getOb().getX());
		System.out.println(a.getY()); 

	}

}
