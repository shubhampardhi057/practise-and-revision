package com.prowings.array;

public class SpecifiedGridArray {
	
	public static void main(String[] args) {
		
		int [] [] a =new int [50] [50];
		
		for(int i = 0 ;i<50;i++)
		{
			for(int j = 0 ;j<50;j++)
			{
				System.out.printf("&",a[i][j]);
			}
			System.out.println();
		}
	}
}
