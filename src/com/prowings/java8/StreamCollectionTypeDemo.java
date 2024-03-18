package com.prowings.java8;

import java.util.Arrays;
import java.util.List;

public class StreamCollectionTypeDemo {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(myList.stream().filter(e -> e%2 == 0).mapToInt(e -> e*2).sum());
	}

}
