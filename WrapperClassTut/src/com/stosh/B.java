package com.stosh;

public class B {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		String m = "X";
		String n = "Y";
		
		Integer x = new Integer(5);
		Integer y = new Integer(8);
		
		System.out.println(a);
		System.out.println(x);
		
		System.out.println(a==b);
		System.out.println(x==y);
		System.out.println(m==n);

		System.out.println(x.equals(y));
		
		System.out.println(a==x); //Boxing
	}

}
