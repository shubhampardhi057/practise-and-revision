package com.prowings.revision;

public class TestEmployeeEqualHashcode {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Shubham",15000);
		Employee emp2 = new Employee(101,"Shubham",15000);
		
		
		System.out.println(emp1.equals(emp2));
		
		
		System.out.println(emp1 == emp2);
	}

}
