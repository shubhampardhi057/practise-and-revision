package com.prowings.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerailizationTeacher {
	
	public static void main(String[] args) {
		
		Teacher teach = new Teacher(10,"Ram","English");
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try {
			file = new FileOutputStream("Teacher.ser");
			out = new ObjectOutputStream(file);
			
			out.writeObject(teach);
			
			System.out.println("Object Serlized Successfully !!!");
			
		}catch (Exception e) 
		{
			System.out.println("Exception while serializing the Object !!!"+e.getMessage());
			e.printStackTrace();
		}
	}

}
