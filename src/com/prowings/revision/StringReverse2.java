package com.prowings.revision;

public class StringReverse2 {
	
	public static void main(String[] args) {
		
		String word = "SHUBHAMPARDHI";
		
		StringBuffer sb1 = new StringBuffer(word);
		
		StringBuffer sb1Reversed = sb1.reverse();
		
		String s1Reversd = new String(sb1Reversed);
		
		System.out.println(s1Reversd);
		
		
		
		for(int i = word.length()-1;i>=0;i--)
		{
			System.out.print(word.charAt(i)+"  ");
		}
		
		System.out.println(">>>>>>>>>>>>>.");
		
		
		
		char[] chars = word.toCharArray();
		char[] result = new char[chars.length];
		
		int j=0;
		
		for(int i = word.length()-1;i>=0;i--)
		{
			result[j] = chars[i];
			j++;
		}
		System.out.println(result);
		
				
	}

}
