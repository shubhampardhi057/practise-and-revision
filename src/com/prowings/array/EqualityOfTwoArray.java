package com.prowings.array;

public class EqualityOfTwoArray {
	
	public static void main(String[] args) {
		
	int [] num1 = {10,20,30,40,50,60,70};
	int [] num2 = {10,30,20,40,50,60,70};
	int [] num3 = {10,20,30,40,50,60,70};
	
	checkEquality(num1,num3);
	checkEquality(num1,num2);
	
	}
	private static void checkEquality(int[] num1, int[] num2) {
		
		boolean equalOrNot = true;
		
		if(num1.length == num2.length)
		{
			for(int i=0;i<num1.length;i++)
			{
				if(num1[i] != num2[i])
				{
					equalOrNot = false;
					
				}
			}
		}
		else
		{
			equalOrNot = false;
		}
		if(equalOrNot)
		{
			System.out.println("Two Arrays are Equal");
		}
		else
		{
			System.out.println("Two Arrays are not Equal");
		}
		
	}

}
