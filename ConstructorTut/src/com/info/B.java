package com.info;

public class B{

	public String name;
	public String address;
	
	public  B(){
		//System.out.println("Default constructoer B");
	}
	
	//Overloaded Constructor
	public B(String name){
		this.name = name;
	}
	
	public B(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		
		B b1 = new B();
		B b2 = new B("Ram");
		B b3 = new B("Hari", "Ktm");
		
		b1.name = "Shyam";
		b1.address = "Ktm";
		
		b2.address = "Bkt";
		
		System.out.println(b1.name + "--"+b1.address);
		System.out.println(b2.name + "--"+b2.address);
		System.out.println(b3.name + "--"+b3.address);
		
		
	}

}
