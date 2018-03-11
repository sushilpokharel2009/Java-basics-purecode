package com.stosh;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your last name?");
		
		String LastName = s.next();
		
		if(LastName.equals("Carswell")){
			System.out.println("You dont have to wait so long.");
			String LastName1 = s.next();
		}
		else if(LastName.equals("Jones")){
			System.out.println("That is not bad.");
			String LastName2 = s.next();
		}
		else if(LastName.equals("Smith")){
			System.out.println("Looks like a bit of wait.");
			String LastName3 = s.next();
		}
		else if(LastName.equals("Young")){
			System.out.println("It's gonna be a while.");
			String LastName4 = s.next();
		}

	}

}
