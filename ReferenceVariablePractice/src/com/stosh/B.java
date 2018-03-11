package com.stosh;

public class B {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		
		a1.name = "Ram";
		a2.name = "Gyanu";
		
		System.out.println(a1.name);
		System.out.println(a2.name);
		
//		a1 = a2;
//		System.out.println("----------------");
//		System.out.println(a1.name);
//		System.out.println(a2.name);
//	
//		
		a2 = a1;
		System.out.println("----------------");
		System.out.println(a1.name);
		System.out.println(a2.name);

	}

}
