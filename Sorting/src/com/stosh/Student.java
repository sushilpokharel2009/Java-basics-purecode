package com.stosh;

public class Student implements Comparable<Student>{

	public int id;
	public String name;
	public String address;
	
	public Student(int id, String name, String address){		
		this.id = id;
		this.name = name;
		this.address = address;		
	}
	
	
	@Override
	public String toString() {
		
		return id+"---"+name+"---"+address;
	}


	@Override
	public int compareTo(Student s) {		
		return s.id - this.id;
		//return  this.name.compareTo(s.name);
		//return this.address.compareTo(s.address);
	}
	
	
	
	
}
