package com.springcore.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		 Student stu = context.getBean("getStudent", Student.class);
		 System.out.println(stu.toString());
		 stu.study();
		 context.close();
	}

}
