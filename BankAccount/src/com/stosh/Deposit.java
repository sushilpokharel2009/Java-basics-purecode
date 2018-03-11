package com.stosh;

public class Deposit implements Runnable{
	int amount = 0;
	
	@Override
	public  void run(){
		
		if(Thread.currentThread().getName().equals("Ram")){
			newDeposit(400);
		}else{
			newWithdraw(300);
		}
	}
	
	
	public synchronized  void newDeposit(int a){
		if(amount == 0){
		amount = a + amount;
		System.out.println(Thread.currentThread().getName()+"Your new balance is"+amount);
		}
	}

	public synchronized  void newWithdraw(int a){
		if(amount > a){
		amount =  amount-a;
		System.out.println(Thread.currentThread().getName()+"Your new balance is"+amount);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Deposit d1 = new Deposit();
		
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		
		t1.setName("Ram");
		t2.setName("Hari");
		
		t1.start();
		t1.join();
		t2.start();
	}

}
