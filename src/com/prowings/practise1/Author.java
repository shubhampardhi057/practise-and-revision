package com.prowings.practise1;

public class Author {
	
	String authorName;
	int age;
	String place;
	
	public Author() {
		super();
	}

	public Author(String authorName, int age, String place) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", age=" + age + ", place=" + place + "]";
	}
	
	
	
	

}
