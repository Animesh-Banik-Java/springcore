package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop implements InitializingBean, DisposableBean {
	private int price;

	public Laptop(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is destroy method from interface : ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is aftetrPropertiesSet() method from interface : ");
		
	}
	
	
	
}
