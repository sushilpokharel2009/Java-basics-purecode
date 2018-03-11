package com.stosh;

public class A {

	public static void main(String[] args) {
		
		int i = 999999;
		long j = 9999999l;
		
		float x =  5.5f;
		double y = 5;

	//	j = i;
		i=(int)j;
		System.out.println(i);
		
		//y = x;
		x = (float)y;
	}

}
