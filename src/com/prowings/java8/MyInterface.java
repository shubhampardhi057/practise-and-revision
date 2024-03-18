package com.prowings.java8;

public interface MyInterface {
	
	public void existingMethod();
	
	default public void newDefaultMethod() {
		
		System.out.println("New default method" + " is added in interface");
	}

}
