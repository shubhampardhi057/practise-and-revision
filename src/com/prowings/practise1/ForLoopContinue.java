package com.prowings.practise1;

public class ForLoopContinue {
	
	public static void main(String[] args) {
		
		for(int i=1;i<6;i++)
		{
			if(i == 3)
			{
				continue;
			}
			System.out.println("i :=  " + i);
		}
	}

}
