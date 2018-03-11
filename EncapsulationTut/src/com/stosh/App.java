package com.stosh;

public class App {

	public static void main(String[] arg){
		
		
		Student s1 = new Student();
		s1.name = "Ram";
	//	s1.email = "r@r.com";		
		
		s1.setEmail("r@r.com");
		
		System.out.println(s1.name);
		System.out.println(s1.getEmail());
		
	}
	
}
