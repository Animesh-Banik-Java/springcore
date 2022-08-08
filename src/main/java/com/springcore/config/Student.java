package com.springcore.config;

public class Student {
	private Samosa samosa;
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.getPrice();
		System.out.println("studing method calling ");
	}
}
