package com.prowings.revision;

public class StringReverse {

	public static void main(String[] args) {
		
		String input = "Shubham";
		
		for(int i = input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i));
		}
		
		StringBuffer sb = new StringBuffer(input);
		
		StringBuffer sbReversd = sb.reverse();
		
		String string = new String(sbReversd);
		
		System.out.println("Reverse :="+ string);
		
	}
}
