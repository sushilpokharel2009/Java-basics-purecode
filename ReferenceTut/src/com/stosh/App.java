package com.stosh;

public class App {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		A a3 = a2;
		A a4 = a2;
	
		
		a1.name = "Ram";
		a2.name = "Hari";
		
		System.out.println(a1.name);
		System.out.println(a2.name);
		
		a1=a2;
		
		System.out.println(a1.name);
		System.out.println(a2.name);
		
		a1.name = "Shyam";
		
		System.out.println(a1.name);
		System.out.println(a2.name);
		
		
		int i = 5;
		int y = 6;
		
		i=y;
		i=3;
		
		
		
	}

}
