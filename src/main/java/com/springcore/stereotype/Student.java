package com.springcore.stereotype;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sdent")
public class Student {
	@Value("Animesh Banik")
	private String name;
	@Value("#{45+25}")
	private int rollno;
	@Value("#{list1}")
	private ArrayList<String> list;
	@Value("#{T(java.lang.Math).PI}")
	private double getPI;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double getStaticMethod;
	@Value("#{(new java.lang.String('Spring Framework'))}")
	private String getObj;
	@Value("#{54>35}")
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public double getGetPI() {
		return getPI;
	}

	public void setGetPI(double getPI) {
		this.getPI = getPI;
	}

	public double getGetStaticMethod() {
		return getStaticMethod;
	}

	public void setGetStaticMethod(double getStaticMethod) {
		this.getStaticMethod = getStaticMethod;
	}

	public String getGetObj() {
		return getObj;
	}

	public void setGetObj(String getObj) {
		this.getObj = getObj;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", list=" + list + ", getPI=" + getPI
				+ ", getStaticMethod=" + getStaticMethod + ", getObj=" + getObj + ", isActive=" + isActive + "]";
	}
	
	
}
