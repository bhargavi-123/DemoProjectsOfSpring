package com.cg.entity;
import javax.annotation.*;

public class Book {
	private String isBn;
	private String year;
	private Author author;
	public String getIsBn() {
		return isBn;
	}
	public void setIsBn(String isBn) {
		this.isBn = isBn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setUp() {
		System.out.println("it is setup()");
	}
	public void cleanUp() {
		System.out.println("It is cleanUp()");
	}
	@PostConstruct
	public void customInit() {
		System.out.println("It is customInit()");
	}
	@PreDestroy
	public void customDestroy() {
		System.out.println("It is CustomDestroy()");
	}
	@Override
	public String toString() {
		return "Book [isBn=" + isBn + ", year=" + year + ", author=" + author
				+ "]";
	}
	
}
