package com.stosh;

public class App {

	public static void main(String[] args) {
		
		Table t1 = new Table();
		Table t2 = new Table();
		
		t1.length = 2;
		t1.width = 1;
		t1.color = "Black";
		t1.material = "Wood";

		t2.length = 3;
		t2.width = 1;
		t2.color = "Red";
		t2.material = "Plastic";
		
		System.out.println(t1.color);
		
	}

}
