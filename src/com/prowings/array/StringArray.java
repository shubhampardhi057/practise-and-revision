package com.prowings.array;

import java.util.Arrays;

public class StringArray {
	
	public static void main(String[] args) {
		
	
	String [] word = {"hello","hii","AAA","BBB","CCC"};
	String [] words = {"hello","hii","AAA","BBB","CCC"};
	
	System.out.println(word.equals(words));
	
	System.out.println(Arrays.equals(word,words));
	
	Arrays.fill(words,"AAA");
	

	System.out.println(Arrays.toString(words));
	
	
	String [] word3 = Arrays.copyOf(word,4);
	
	System.out.println(Arrays.toString(word3));
	
	
	
	
	}
}
