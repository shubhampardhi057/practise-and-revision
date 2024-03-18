package com.prowings.array;

import java.util.Arrays;

public class ArraysMethods {
	
	public static void main(String[] args) {
		
		int [] num = {90,10,20,50,80,30,40};
		
		int [] number = {90,10,20,50,80,30,40};
		
		
		Arrays.sort(num);
		Arrays.sort(number);
		
		System.out.println(Arrays.toString(num));
		
		System.out.println(Arrays.binarySearch(num,30));
		
		
		System.out.println(num.equals(number));
		
		System.out.println(num == number);
		
		System.out.println(Arrays.equals(num, number));
		
		int [] num3 = Arrays.copyOf(num,7);
		
		System.out.println("CopyOf : "+Arrays.toString(num3));
	}

}
