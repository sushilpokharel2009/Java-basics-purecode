package com.stosh;

public class A {

	public static void main(String[] args) {
		
		String a = "Ram";
		String b = "Ram";
		String x = new String("Hari");
		String y = new String("Hari");
		
		System.out.println(a==b);
		System.out.println(x==y);
		
		System.out.println(a.equals(b));
		System.out.println(x.equals(y));
		

	}

}
