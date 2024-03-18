package com.prowings.practise1;

public class Method {
	
	public void m1(char a,char b,int i) {
		System.out.println("m1 char a,char b,int i");
		
	}
	
	public void m1(Long l) {
		System.out.println("m1 Long l");
		
	}		
	public void m1(int a,Integer...i) {
		System.out.println("m1 Integer...i");
			
	}
	public void m1(char...c) {
		System.out.println("m1 char...c");
	}
	public void m1(char c) {
		System.out.println("m1 char c");
	}
	
	public static void main(String[] args) {
		
		Method m = new Method();
		
		Integer i = 10;
		//Integer j = 20;
		
		
		m.m1('a','b',i);
		
	}
	
	

}
