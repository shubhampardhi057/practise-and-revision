package com.prowings.cloning;

public class Employee implements Cloneable {
	
	int id;
	String name;
	Address address;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Employee clonedEmp = (Employee)super.clone();
		
		clonedEmp.address = (Address)address.clone();
		
		return clonedEmp;
		
	}
	
	

}
