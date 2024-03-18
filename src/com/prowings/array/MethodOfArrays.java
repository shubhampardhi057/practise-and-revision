package com.prowings.array;

import java.util.Arrays;

public class MethodOfArrays {
	
	public static void main(String[] args) {
		
		int [] num = {100,20,70,10,30,40,80,60,90,50};
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		for(int i=num.length-1;i<num.length;i++) {
			
			System.out.println(Arrays.toString(num));
		}
		
		for(int number:num) {
			
			System.out.print(number+" " );
		}
		
		Object [] obj = {50,"hello",50.0f,'d',true,100l,10.0d};
		
		System.out.println(obj[0].getClass().getName());
		System.out.println(obj[1].getClass().getName());
		System.out.println(obj[2].getClass().getName());
		System.out.println(obj[3].getClass().getName());
		System.out.println(obj[4].getClass().getName());
		System.out.println(obj[5].getClass().getName());
		System.out.println(obj[6].getClass().getName());
		
	}

}
