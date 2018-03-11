package com.stosh;

public class App {

	public static void main(String[] args) {
		
		A<String, Integer> a1 = new A();

		a1.x = "Ram";
		a1.y = 1;
		
		A<Integer, Double> a2 = new A();
		a2.x = 1;
		a2.y = 5.5;
	}

}
