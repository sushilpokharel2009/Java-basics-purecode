package com.stosh;

public class B {

	public static void main(String[] args) {
		
		String a = new String("Ram");
		a = a.concat("Hari");
		
		System.out.println(a instanceof String);
		
		StringBuilder x = new StringBuilder("Ram");//StringBuffer
		x.append("HAri");
		
		System.out.println(x);
		
		
		
	}

}
