package com.stosh;

public class App {

	public static void main(String[] args) {
		
		A a = new A();
		A b = new B();
		
		a.abc();
		b.abc();
		
		A c = new A(){
			
			@Override
			public void abc(){
				System.out.println("C-->>");
			}
			
		};
			
		c.abc();

	}

}
