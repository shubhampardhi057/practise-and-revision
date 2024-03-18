package com.prowings.java8;

import java.util.Arrays;
import java.util.List;

public class LamdaExpressionDemo {
	
	public static void main(String[] args) {
		
//		Thread th = new Thread();
		
//		System.out.println("Thread th is Running !!!");
		
		Thread th = new Thread(() -> System.out.println("Thread th is Running By Lamda !!!"));
		
		th.start();
		
		System.out.println("Main Thread Runnimg !!!");
		
		
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		myList.forEach(t -> System.out.println(t));
		
	}

}
