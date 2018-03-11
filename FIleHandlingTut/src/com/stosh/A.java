package com.stosh;

import java.io.File;

public class A {

	public A abc(){
		return new A();
	}
	
	public static void main(String[] args) {
	
		A a = new A();
		
		
		try{
		
		File f = new File("a.txt");
		
		f.createNewFile();
		
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.isDirectory());

		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
