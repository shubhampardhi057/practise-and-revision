package com.prowings.practise1;

public class Constructor {
	
	int rollno;
	String name;
	
	public Constructor(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(101,"Ram");
	
		System.out.println(obj.rollno);
		System.out.println(obj.name);
		
	}
	
	

}
