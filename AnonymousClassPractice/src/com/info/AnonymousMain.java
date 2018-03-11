package com.info;

public class AnonymousMain {

	public static void main(String[] args) {
		AnonymousA a1 = new AnonymousA();
		AnonymousA a2 = new AnonymousB();
		
		
		
		AnonymousA a3 = new AnonymousA(){
			public void abc() {
				System.out.println("C--------");
			}
		};
		
		AnonymousA a4 = new AnonymousB(){
			public void abc() {
				System.out.println("D--------");
			}
		};
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc();
	}

}
