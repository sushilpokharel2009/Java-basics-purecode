package com.stosh;

public class C {

	public static void main(String[] args) {
		
		String s = "123";
		
		int x = Integer.parseInt(s);
		Integer y = Integer.valueOf(s);
		
		long z = Long.parseLong(s);
		double d = Double.parseDouble(s);
		int i = 5;
		Integer j =  Integer.valueOf(i);
		
		System.out.println(x);
	}

}
