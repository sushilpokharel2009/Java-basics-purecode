package com.stosh;

public class B {

	public static void main(String[] args) {
		
		try{
			
			System.out.println("A-->>");
			
			int i = 1/0;
			
			int j = 2/0;
						
			System.out.println("B-->>");
			
		}finally{
			System.out.println("Finally--->>>");
		}
		
		System.out.println("C-->>");

	}

}
