package com.prowings.revision;

public class StringScenarios {
	
	public static void main(String[] args) {
		
		String s1 = new String("Helloworld");
		String s2 = "Hello";
		String s3 ="World";
		String s4 = s2.concat(s3);
		String s5 = "Helloworld";
		
		System.out.println(s1 == s4);
		System.out.println(s4 == s5);
		System.out.println(s1 == s5);
		
		String s6 = s2+s3;
		
		System.out.println(s5 == s6);
		
	}
}
