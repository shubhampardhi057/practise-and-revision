package com.prowings.array;

import java.util.Arrays;

public class RemoveElementFromArray {
	
	public static void main(String[] args) {
		
		int []number = {25,40,50,70,80,90,10};
		
		int index = 5;
		
		for(int i=index;i<number.length-1;i++)
		{
			number[i] = number[i+1];			
		}
		
		System.out.println(Arrays.toString(number));
	}

}

