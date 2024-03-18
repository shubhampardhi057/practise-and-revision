package com.prowings.practise1;

public class Test_Multiple_Inheritance extends AbstractClass_1 implements Interface_1,Interface_2 {
	
	public void m1() {
		
		System.out.println("m1() method");
	}
	
	public void m2() {
		
		System.out.println("m2() method");
	}

	public void m3() {
		
		System.out.println("m3() method");
	}

	public static void main(String[] args) {
		
		Test_Multiple_Inheritance obj = new Test_Multiple_Inheritance();
		
		obj.m1();
		obj.m2();
		obj.m3();
		
	}

}
