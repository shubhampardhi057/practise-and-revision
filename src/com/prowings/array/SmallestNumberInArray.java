package com.prowings.array;

public class SmallestNumberInArray {
	
	public static void main(String[] args) {
		
		int [] a = {23,10,60,75,30,40};
		
		int min = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		
		
		System.out.println(min);
	}

}
