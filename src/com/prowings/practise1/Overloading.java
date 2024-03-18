package com.prowings.practise1;

public class Overloading {
	
	public void m1(int a) {
		System.out.println("m1 method int a");
	}
	
	public void m1(double b) {
		System.out.println("m1 method double b");
	}
	
	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		
		obj.m1(10);
		
		
	}

}
