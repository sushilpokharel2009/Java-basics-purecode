package com.stosh;

public class E extends D{

	public static void main(String[] args) {
		D <String>e1 = new D();
		e1.a ="Ram";
		e1.b ="Hari";
		
		
		D<Integer> e2 = new D();
		e2.a = 12;
		
		System.out.println(e1.a);
		System.out.println(e1.b);
		System.out.println(e2.a);
	}

}
