package com.stosh;

public class A extends Thread{

	@Override
	public void run(){
		
		for(int i = 0; i<15; ++i){
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		A t1 = new A();
		A t2 = new A();
			
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();

	}

}
