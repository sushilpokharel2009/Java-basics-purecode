package com.stosh;

public class B extends A{

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		A a1 = new A();
		A b1 = new B();
		
		A a2 = new B();
		B b2 = new B();
		
	//	a = b;
		b = (B)a;
 
	//	a1 = b1;
	//	b1 = a1;
		
	//	a2 = b2;
		b2 = (B)a2;
		
		
		
	}

}
