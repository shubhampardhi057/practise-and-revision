package com.prowings.copyconstructor;

public class Student {
	
	int roll;
	String name;
	Address address;
	
	
	public Student() {
		super();
	}


	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	public Student(Student std) {
		
		this.roll=std.roll;
		this.name=std.name;
//		this.address=std.address;
		
		Address cloneAddress = new Address();
		
		cloneAddress.pin=std.address.pin;
		cloneAddress.city=std.address.city;
		
		this.address=cloneAddress;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
