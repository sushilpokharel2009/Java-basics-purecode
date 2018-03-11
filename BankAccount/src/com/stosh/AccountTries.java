package com.stosh;

public class AccountTries implements Runnable{
	
	
	//int tries = 0;
	
	@Override
	public void run() {
		
		for(int i=1; i<=3; i++){
			
		makeTries(i);
		}
	}
	
	
	

	public synchronized void makeTries(int tries){
			 
		if(tries >=3){
			System.out.println("You tried more than three times and you are logged out");
			
		}else{
			System.out.println(Thread.currentThread().getName()+" -- try again");
		}
		
	}

	public  static void main(String[] args) {
		
		AccountTries a1 = new AccountTries();
		
		
		Thread t1 = new Thread(a1);
		
		Thread t2 = new Thread(a1);
	
			
		
		t1.start();
		t2.start();
	
	}

}
