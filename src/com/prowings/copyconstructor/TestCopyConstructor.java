package com.prowings.copyconstructor;

public class TestCopyConstructor {
	
	public static void main(String[] args) {
		
		Address address = new Address(1234,"pune");
		
		Student std1 = new Student(101,"Ram", address);
		
		Student std2 = new Student(std1);
		
		std2.address.city = "Mumbai";
		
		System.out.println(std1);
		
		System.out.println(std2);
		
		System.out.println(std1 == std2 );
		
		
		
	}
	

}
