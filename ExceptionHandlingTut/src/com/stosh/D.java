package com.stosh;

import java.io.IOException;

public class D {

	public void abc() throws IOException{
		System.out.println("C-->");
	//	throw  new ArithmeticException(); // UnChecked Runtime
	//try{
		throw new IOException();  //CHecked 
	//	}catch(Exception e){
	//		
	//	}
	}
	
	
	public void xyz() throws IOException{
		System.out.println("B-->");
		
		abc();
		System.out.println("D-->");
	}
	
	public static void main(String[] args){
		
	D d = new D();
		
	System.out.println("A-->");
	try{
	d.xyz();
	}catch(Exception e){
		
	}
	System.out.println("E-->");
	
	}
	
}
