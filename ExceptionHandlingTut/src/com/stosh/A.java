package com.stosh;

public class A {

	public void abc(String a){
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("A----->>>") ;
		try{
			
			int  i = 1/00;
			
			System.out.println("B-----");
			
			
			
		}catch(NullPointerException e){
			System.out.println("Ex---");
			e.printStackTrace();			
		}catch(ArithmeticException e) {
			System.out.println("Ari---");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("E----->>>");
			e.printStackTrace();
		}
		
		System.out.println("C------->>>>>");

	}

}
