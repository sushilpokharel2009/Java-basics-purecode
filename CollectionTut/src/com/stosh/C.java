package com.stosh;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C {

	public static void main(String[] args) {
		
		Set<String> s = new TreeSet<String>();
		
		s.add("Ram");
		s.add("Hari");
		s.add("shyam");
		s.add("Arjun");
		s.add("Ram");

		for(String n:s){
			System.out.println(n);
		}
		
		
		
		
	}

}
