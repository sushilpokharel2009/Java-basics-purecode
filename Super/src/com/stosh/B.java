package com.stosh;

public class B extends A{
	public int rollNo = 105; 

	@Override
	public void abc() {
		System.out.println("UVW--------");
			
	}
	
	public void mno(){
		System.out.println("POQ-------");
	}
	
	public void xyz(){
		mno();
		System.out.println("QRS------");
		System.out.println(super.name+ " "+ super.age+ " " + super.address+ " "+rollNo);
	}
	
}
