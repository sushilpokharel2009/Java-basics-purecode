package com.stosh;

import java.util.Properties;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("user.name"));
		
		Properties p  = System.getProperties();
		
		Set<Object> key = p.keySet();
		
		for(Object k:key){
			System.out.println(k+"---"+System.getProperty((String)k));
		}
		
	}

}
