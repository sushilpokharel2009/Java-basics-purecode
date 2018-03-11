package com.stosh;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Are u want 2 start quiz ?");
		
		String a = s1.next();
		
		if(a.equals("yes")){
			
			System.out.println("1:adasdadasdas");
			System.out.println("   a :kjgkjg");
			System.out.println("    b : kjgjhvjhj");
			System.out.println("Choose your answr :");
			Scanner s2 = new Scanner(System.in);
			
			String b = s2.next();
			
			if(b.equals("a"))
			{
				System.out.println("Soory answe is wrohg");
			}else if(b.equals("b")){
				System.out.println("You are right");
				
				
				
			}
		}

	}

}