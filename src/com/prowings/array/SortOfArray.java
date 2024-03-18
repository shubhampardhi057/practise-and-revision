package com.prowings.array;

import java.util.Arrays;

public class SortOfArray {

	public static void main(String[] args) {
		
		
	int[] num = {10,2,9,7,3};
	
	int temp=0;
	
	for(int i=0;i<num.length;i++) {
		
		for(int j=i+1;j<num.length;j++) {
			
			if(num[i] > num[j]) {
				
				temp=num[i];
				num[i] = num[j];
				num[j] = temp;
				
				
			}
		}
		
	}
	System.out.println(Arrays.toString(num));

	}
}
