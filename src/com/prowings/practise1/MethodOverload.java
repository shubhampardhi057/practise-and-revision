package com.prowings.practise1;

public class MethodOverload {

	public int multiply(int a,int b) {
		
		return a*b;
	}
	
	public long multiply(int a,long b,int c) {
		
		return a*b*c;
		
	}
	
	public float multiply(long a,int b,int c,int d) {
		
		return a*b*c*d;
	}

	public static void main(String[] args) {
		
		MethodOverload math = new MethodOverload();
		
		System.out.println(math.multiply(10, 20));
		System.out.println(math.multiply(10,20,30));
		System.out.println(math.multiply(10,20,30,40));
		
	}
	
}
