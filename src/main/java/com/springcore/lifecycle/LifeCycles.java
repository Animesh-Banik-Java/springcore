package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycles {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/lifecycle/lifecycleconfig.xml");

		Mobile mo = (Mobile) context.getBean("m1");
		System.out.println(mo.toString());
		context.registerShutdownHook();
		System.out.println("----------------------------------------------------------------------------");

		Laptop la = (Laptop) context.getBean("lap");

		System.out.println(la);
		System.out.println("----------------------------------------------------------------------------");

		BookAnno anno = (BookAnno) context.getBean("bookanno");
		System.out.println(anno);
	}

}
