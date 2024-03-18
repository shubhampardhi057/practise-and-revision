package com.prowings.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraylistToArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		
		
		Object [] obj = al.toArray();
		
		System.out.println(Arrays.toString(obj));
		
		String [] s = {"hi","hello"};
		
		List<String> l1 = Arrays.asList(s); 
		
		Set<String> set = new HashSet<>(l1);
		
		System.out.println(set);
		
		
	}

}
