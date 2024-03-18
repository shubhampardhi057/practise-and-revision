package com.prowings.practise1;

public class ConstuctorThisDemo {
	
	int id;
	String name;
	
	
	public ConstuctorThisDemo() {
		super();
//		this(10,null);
	}
	
	
	public ConstuctorThisDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello");
	}

}
