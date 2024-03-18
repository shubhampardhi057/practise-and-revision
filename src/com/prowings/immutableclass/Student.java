package com.prowings.immutableclass;

public final class Student {
	
	private final int roll;
	private final String name;
	private final Address address;
	
	
	public Student() {
		super();
		this.roll = 0;
		this.name = "";
		this.address = new Address();
	}


	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
//		this.address = address;
		
		Address cloneAddress = new Address();
		
		cloneAddress.setPin(address.getPin());
		cloneAddress.setCity(address.getCity());
		
//		cloneAddress.pin=address.getPin();
//		cloneAddress.city=address.getCity();
		
		this.address = cloneAddress;
	}


	public int getRoll() {
		return roll;
	}


//	public void setRoll(int roll) {
//		this.roll = roll;
//	}


	public String getName() {
		return name;
	}


//	public void setName(String name) {
//		this.name = name;
//	}


	public Address getAddress() {
		
	
		Address dummyAddress = new Address();
		
		dummyAddress.setPin(this.address.getPin());
		dummyAddress.setCity(this.address.getCity());
		
	
		return dummyAddress;
		
//		return address;
	}


//	public void setAddress(Address address) {
//		this.address = address;
//	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
