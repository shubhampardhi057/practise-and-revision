package com.prowings.array;

public class SwappingOfTwoNumbers {
	
	public static void main(String[] args) {
		int a =15;
		int b = 27;
		
		System.out.println("Before Swapping : a,b = "+ a + " , "+ b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping : a,b = "+ a + " , "+ b);
	}

}
