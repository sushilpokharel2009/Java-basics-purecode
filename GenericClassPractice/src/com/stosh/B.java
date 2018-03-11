package com.stosh;

public class B{
	
	public void abc(){
		System.out.println("ABC-------");
		
	}
	
	public void mno(){
		
	}

	public static void main(String[] args) {
		A <String>a1 = new A();
		A <Integer>a2 = new A();
		B b1 = new B();
		b1.abc();
		a1.abc();
		
		a1.name = "Ram";
		a2.age = 12;
		
		System.out.println(a1.name +" "+ a2.age);
		
		
		

	}

}
