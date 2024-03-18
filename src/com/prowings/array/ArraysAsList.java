package com.prowings.array;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
	
	public static void main(String[] args) {
		
		Integer [] num =  {10,20,30,40,50};
		
		List<Integer> asList = Arrays.asList(num);
		
		System.out.println("List Of Integer : "+asList);
	}

}
