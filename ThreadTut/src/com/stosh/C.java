package com.stosh;

public class C implements Runnable{

	int balance = 500;
	
	@Override
	public void run(){
		
	withdraw();
		
	}
	
	
	public synchronized void withdraw(){
		int amount = 300;
		if(balance > amount){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw and your balance is "+balance);
			balance = balance-amount;
			System.out.println(Thread.currentThread().getName()+" has completed transaction and the remaining balance is "+balance);
			
		}else{
			System.out.println(Thread.currentThread().getName()+ " Sorry not sufficient amount...");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		C c = new C();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.setName("Ram");
		t2.setName("Hari");
		t1.start();
		t2.start();

	}

}
