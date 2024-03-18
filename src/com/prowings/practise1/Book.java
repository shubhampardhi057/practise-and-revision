package com.prowings.practise1;

public class Book {
	
	String name;
	int price;
	Author author;
	public Book() {
		super();
	}
	public Book(String name, int price, Author author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
	
	

}
