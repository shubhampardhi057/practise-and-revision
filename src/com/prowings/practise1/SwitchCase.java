package com.prowings.practise1;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		int number = 32 ;
		String size;
		
		switch(number)
		{
		case 28:
		size="small";
		break;
		
		case 30:
		size="medium";
		break;
		
		case 32:
		size="large";
		break;
		
		default:
		size="unknown";
		break;
		}
		System.out.println("size: =" + size);
	}

}
