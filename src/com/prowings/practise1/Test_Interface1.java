package com.prowings.practise1;

public class Test_Interface1 implements Interface1 {
	
	public void m1() {
		
		System.out.println("m1 method Interface");
	}
	
	public void m2() {
		System.out.println("m2 method Interface");
		
	}
	
	public static void main(String[] args) {
		
		Test_Interface1 t = new Test_Interface1();
		
		t.m1();
		t.m2();
		
	}
	
}
