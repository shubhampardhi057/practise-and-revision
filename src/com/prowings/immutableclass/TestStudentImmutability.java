package com.prowings.immutableclass;

public class TestStudentImmutability {

	
	public static void main(String[] args) {
		
		Address address = new Address(1234,"Pune");
		
		Student std = new Student(10, "Ram",address);
		
		System.out.println("Before change Student !!!! :  "+std);
		
		address.setCity("Mumbai");
		
		std.getAddress().setPin(4321);
		
		System.out.println("After change Student !!!! :  "+std);
		
		

	}
}
