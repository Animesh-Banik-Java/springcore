package com.springcore.lifecycle;

public class Mobile {
	private int price;

	public Mobile(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [price=" + price + "]";
	}
	
	
	  public void init() { System.out.println("now calling init method"); }
	  
	  public void destroy() { System.out.println("now calling destroy method"); }
	 
}
