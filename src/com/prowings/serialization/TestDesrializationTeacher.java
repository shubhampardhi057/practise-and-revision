package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDesrializationTeacher {
	
	public static void main(String[] args) {
		
		try
		{
			FileInputStream file = new FileInputStream("Teacher.ser");
			ObjectInputStream in =  new ObjectInputStream(file);
			
			Teacher deserialsedTeacher = (Teacher)in.readObject();
			
			System.out.println(deserialsedTeacher);
			
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception while deserializing Stream !!!");
			
			e.printStackTrace();
			
		}
	}

}
