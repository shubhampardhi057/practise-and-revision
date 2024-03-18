package com.prowings.cloning;

public class Student implements Cloneable {

	int roll;
	String name;
	String address;
	
	
	public Student() {
		super();
	}


	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student(101, "Ram","Pune");
		
		Student s2 = (Student) s1.clone();
		
		
		s1.name ="Sham";
		
		System.out.println("S1"+s1);
		
		System.out.println("S2"+s2);
		
		System.out.println(s1 == s2);
	}
	
}
