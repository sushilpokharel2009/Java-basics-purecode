package com.stosh;

public class A {

	public static void main(String[] args){
		
		int a =  5;
		String b = "Ram";
		
		int[] i = new int[4];
		String[] name = new String[3];
		
		i[0] = 5;
		i[1] =  6;
		i[2] = 7;
		i[3] = 9;
		
		name[0] = "Ram";
		name[1] = "Hari";
		name[2] = "Raj";
		
		System.out.println(i[3]);
		System.out.println(name[2]);
		
		System.out.println("------------");
		
		for(int j = 0; j<name.length; j++){
			String n = name[j];
			System.out.println(n);
		}
		
		System.out.println("-------------");
		
		//Rmhanced for lopp
		for(String n:name){
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
		
	}
	
}
