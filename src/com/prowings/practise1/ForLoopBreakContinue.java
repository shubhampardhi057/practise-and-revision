package com.prowings.practise1;

public class ForLoopBreakContinue {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i == 7)
			{
			break;
			}
			System.out.println(">>>>>>>>i:=  " +i);
			
			for(int j=1;j<=5;j++)
			{
				if(j == 3)
				{
				continue;
				}
			    System.out.println("j :=" + j);
			}
		}
	}

}
