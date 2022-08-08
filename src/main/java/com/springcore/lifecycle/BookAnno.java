package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BookAnno {
	private String bookName;

	public BookAnno(String bookName) {
		super();
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "BookAnno [bookName=" + bookName + "]";
	}
	
	@PostConstruct 
	public void startInit() {
		System.out.println("Start init method by annotation: ");
		
	}
	
	@PreDestroy
	public void enddistroy() {
		System.out.println("Distroy method by annotation: ");
		
	}

	public BookAnno() {
		super();
	}
	
	
	
}
