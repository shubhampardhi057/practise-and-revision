package com.prowings.serialization;

import java.io.Serializable;

public class Teacher implements Serializable {
	
	int id;
//	final String name ="RaM";
	static String name;
//	final transient String subject;
	String subject;
	
	public Teacher() {
		super();
//		this.name = "RaM";
	}
	
	
	public Teacher(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	

}
