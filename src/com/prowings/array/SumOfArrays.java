package com.prowings.array;

public class SumOfArrays {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10,100};
		
		int sum =0;
		
		for(int n : numbers)
		{
			sum = sum+n;
		}
		
		System.out.println("Sum : "+ sum);
	}
}
