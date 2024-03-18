package com.prowings.practise1;

public class ImpAbstractClass extends AbstractClass {

	public void print() {
		
		System.out.println("Inside print method");
	}
	
	public static void main(String[] args) {
		
		ImpAbstractClass obj = new ImpAbstractClass();
		
		obj.print();
		obj.printHello();
		
		
	
		
	}
}
