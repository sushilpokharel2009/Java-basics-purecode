package com.stosh;

public class RefVar {
	public static String n1;
	public static String n2;

	public static void main(String[] args) {
		RefVar r1 = new RefVar();
		r1.n1 = "Ram";
		r1.n2 = "Hari";
		
		System.out.println(n1 = n2);
		
		System.out.println(n2 = n1);
		
		r1.n1 = "Krish";
		
		System.out.println(n2 = n1);
		System.out.println(n1 = n2);
	}

}
