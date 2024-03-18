package com.prowings.array;

import java.util.Arrays;

public class CopyOfNumberInArray {

	public static void main(String[] args) {
		
		int [] num1 = {20,30,40,50,60};
		int [] num2 = new int [5];
		
		System.out.println("num2 : "+ Arrays.toString(num2));
		
		
		for(int i=0 ; i<num1.length;i++)
		{
			
			num2[i] = num1[i];
		}
		
		System.out.println("num2 : "+ Arrays.toString(num2));
		
		
	}
}
