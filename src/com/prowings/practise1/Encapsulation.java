package com.prowings.practise1;

public class Encapsulation {
	
	private int rollno;
	private String name;
	
	public Encapsulation() {
		super();
	}

	public Encapsulation(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}



	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		
		
		obj.setRollno(101);
		obj.setName("abc");
		
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());
		
	}
	
	
}
