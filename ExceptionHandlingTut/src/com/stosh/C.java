package com.stosh;

public class C {

	public static void main(String[] args) {
		
		System.out.println("A-->>");
		try{
			
		throw new Exception();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("B--->>");
	}

}
