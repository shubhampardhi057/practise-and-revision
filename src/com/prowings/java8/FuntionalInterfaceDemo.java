package com.prowings.java8;

public class FuntionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		MyComparator myComp = (a,b) -> a>b ;
		
		System.out.println("Is 4 is greater than 5 :" + myComp.compareMyValues(4,5));
	}

}
