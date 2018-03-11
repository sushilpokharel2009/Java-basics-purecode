package com.stosh;

public class App {

	public void abc(){
		
	}
	
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		
		a1.name = "Arjun";
		a2.name = "Rita";
		
		A.address = "Bhw";
		A.address = "Dharan";

		System.out.println(a1.name);
		System.out.println(a1.address);
		System.out.println(A.address);
		
		System.out.println(a2.name);
		System.out.println(a2.address);
		System.out.println(A.address);
		
		a2.abc();
		
		System.out.println(a1.name);
		System.out.println(a1.address);
		System.out.println(A.address);
		
		A.xyz();
		System.out.println("------------------------------------");
		System.out.println(a1.name);
		System.out.println(a1.address);
		System.out.println(A.address);
		
		System.out.println(a2.name);
		System.out.println(a2.address);
		System.out.println(A.address);
		
	}

}
