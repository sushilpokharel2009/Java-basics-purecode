package com.info;

import java.io.IOException;
import java.rmi.AccessException;

public class A {
	
	private void abc() throws IOException{
		System.out.println("B-------");
		throw new IOException();
		//System.out.println("B-------");
//		try{
//		int j = 1/0;
//		//int j = 1/1;
//		}catch(Exception e){
//			System.out.println("I-------");
//		}
		//System.out.println("H------");
		
	}
	
	public void xyz() throws ArithmeticException{
		System.out.println("F----");
		try{
		int i = 5/0;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("D----");
		}
	}
		
	

	public static void main(String[] args) throws IOException {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		System.out.println("A--------");
		try {
			a1.abc();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("K--------");
		}
		System.out.println("E------");
		a3.xyz();
		System.out.println("C------");
	}	

}
