package com.prowings.java8;

public class InterfaceDefaultMethodDemo implements MyInterface {

	@Override
	public void existingMethod() {
		
		System.out.println("Existing Method !!!");

		
		MyInterface.super.newDefaultMethod();
		
	}
	
	public static void main(String[] args) {
		
		InterfaceDefaultMethodDemo demo = new InterfaceDefaultMethodDemo();
		
		demo.existingMethod();
	}
		
	
	

}
