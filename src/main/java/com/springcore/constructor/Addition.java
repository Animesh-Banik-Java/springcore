package com.springcore.constructor;

public class Addition {
	private int a;
	private int b;
	


	public Addition(double a, double b) {
	 
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("double values: ");
	}
	
	public Addition(int a, int b) {
		 
		this.a = a;
		this.b = b;
		System.out.println("Integer values: ");
	}
	
	public Addition(String a, String b) {
	 
		this.a =  Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String values: ");
	}
	
	
	
	public void doSum() {
		System.out.println("value of A: "+this.a);
		System.out.println("value of B: "+this.b);
		System.out.println("Total Sum is: " + (this.a+this.b));
	}
}
