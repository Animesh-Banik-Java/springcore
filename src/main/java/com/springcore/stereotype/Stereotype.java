package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stereotype {
		@SuppressWarnings("resource")
		public static void main(String str[]) {
			ApplicationContext con = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/stereotype/stereotypeconfig.xml");
			Student dent = con.getBean("sdent", Student.class);
			Student dent2 = con.getBean("sdent", Student.class);
			System.out.println(dent.toString());
			System.out.println("___________________________________________________________");
			
			System.out.println(dent.getList());
			System.out.println(dent.getList().getClass().getName());
			
			System.out.println("___________________________________________________________");
			

			System.out.println("hashCode");
			System.out.println(dent.hashCode());
			System.out.println(dent2.hashCode());
		}
}

