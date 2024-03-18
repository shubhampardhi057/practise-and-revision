package com.prowings.cloning;

public class TestEmployeDeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address(1234,"Pune");
		
		Employee emp = new Employee(101,"Ram",address);
		
		
		Employee emp1 = (Employee)emp.clone();
		
		
		
		emp.address.city = "Mumbai";
		
		
		System.out.println("Emp1"+ emp);
		
		System.out.println("Emp2"+  emp1);
		
		System.out.println(emp == emp1);
	}

}
