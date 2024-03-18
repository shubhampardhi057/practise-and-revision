package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserializationStudent {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("Student.ser");
			
			ObjectInputStream in = new ObjectInputStream(file);
			
			Student deserializedStd=(Student) in.readObject();
			
			System.out.println(deserializedStd);
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	}

}
