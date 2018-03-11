package com.stosh;

public class B extends A{

	public String name="Ram";
	
	@Override
	public void abc(){
		System.out.println("abc =B --->");
	}
	
	public void xyz(){
		super.name = "shyam";
		System.out.println(super.name+"-----"+name);
		super.abc();
		System.out.println("xyz =B --->>>");
	}
	
	public void xyz(int a){
		
	}
	
}
