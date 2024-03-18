package com.prowings.practise1;

public class MethodOverload1 {
	
//	public void m1(int a) {
//		System.out.println("m1 int a method ");
//	}
//	public void m1(long a) {
//		System.out.println("m1 long a method");
//	}
//	public void m1(Integer a) {
//		System.out.println("m1 Integer a method");
//	}
//	public void m1(Number a) {
//		System.out.println("m1 Number a method");
//	}
//	public void m1(Object a) {
//		System.out.println("m1 Object a method");
//	}
//	public void m1(int...name) {
//		System.out.println("m1 int...name method");
//	}
	public void m1(Integer...name) {
		System.out.println("m1 Integer...name method");
	}
	
	
	public static void main(String[] args) {
		
		MethodOverload1 obj = new MethodOverload1();
		
//		Integer i =10;
		
//		Integer [] i = {10,20,30,40};
		
//		obj.m1(i);
		obj.m1(10);
		
	}

}
