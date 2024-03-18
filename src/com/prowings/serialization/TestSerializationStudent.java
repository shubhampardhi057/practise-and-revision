package com.prowings.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerializationStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(10,"Ram","Pune");
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try {
			
			file = new FileOutputStream("Student.ser");
			out = new ObjectOutputStream(file);
			out.writeObject(s1);
			

			System.out.println("Object Serlized Successfully !!!");
			
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
