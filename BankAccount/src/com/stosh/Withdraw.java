package com.stosh;

public class Withdraw implements Runnable {
	
	
	@Override
	public void run() {
		
		
		for(int i = 1; i<=4; i++){
			reject(i);
		}
		
		
	}
	
	
	public synchronized void reject(int r){
		if(r==4){
			
			System.out.println(Thread.currentThread().getName()+" You tried more than three times, you are logged out");
		}else{
			System.out.println("Your pin did not match");
		}
		
	}
	
	

	public static void main(String[] args) {
		Withdraw w1 = new Withdraw();
		
		
		
		Thread t1 = new Thread(w1);
		
		t1.setName("Hello");
		
		t1.start();

	}

	

}
