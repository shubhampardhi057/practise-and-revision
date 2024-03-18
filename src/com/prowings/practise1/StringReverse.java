package com.prowings.practise1;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String input = "Shubham";
		
		
//		StringBuffer sb = new StringBuffer(s);
//		
//		
//		StringBuffer sbrevere = sb.reverse();
//		
//		String s1 = new String(sbrevere);
//		
//		
//		System.out.println(s1);
		
		
		
		
		String s1 = stringReversed(input);
		
		
		System.out.println(s1);
	}

	private static String stringReversed(String input) {
		
		char [] chars = input.toCharArray();
		
		char [] result = new char[chars.length];
		
		int j=0;
		
		for(int i = chars.length-1;i>=0;i--)
		{
			result[j] = chars[i];
			j++;
		}
		
		return new String(result);
		
		
		
		
	}

}
