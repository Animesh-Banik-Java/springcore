package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowirings {

	@SuppressWarnings("resource")
	public static void main(String[] args) { 
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/autowiring/autowiringconfig.xml");
		Emp emp = (Emp) context.getBean("emp");
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println("Result from setter: "+emp.toString());
		System.out.println("Result from constructor: "+emp1.toString());
	}

}
