package com.prowings.practise1;

public class TestBook {
	
	public static void main(String[] args) {
		
		Author author = new Author("John",42,"USA");
		
		Book b = new Book("Java for Beginer",800,author);
				
		System.out.println(author);
		System.out.println(b);
		
		
	}

}
