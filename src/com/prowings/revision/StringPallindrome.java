package com.prowings.revision;

public class StringPallindrome {

	public static void main(String[] args) {
		
		String input = "RADAR";
		
		boolean result = isPallindrome(input);
		
		System.out.println(result);
	}

	private static boolean isPallindrome(String original) {

		String reversedString = "";
		
		StringBuffer sb = new StringBuffer(original);
		
		sb.reverse();
		
		reversedString = new String(sb);
		
	
		return original.equalsIgnoreCase(reversedString)?true:false;
	}
}
