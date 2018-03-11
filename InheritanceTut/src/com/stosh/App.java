package com.stosh;

public class App {

	public static void main(String[] args) {
		
		int i = 9;

	//	X x = new Y();
		
		A a = new A();
		B b = new B();
		
		
		
		a.name = "Ram";
		a.abc();
		
		b.name = "Hari";
		b.abc();
		b.xyz();
		
		
		A a1;
		
		a1 = new B();
		a1.abc();
	//	a1.xyz();

	}

}
