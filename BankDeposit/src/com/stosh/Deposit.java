package com.stosh;

public class Deposit implements Runnable {
	int amount = 0;
	
	@Override
	public void run() {
		//Deposit(4400);
		Deposit(212344454);
		
		Withdraw(10120);
	
	}
	
	
	
		
		

	
	

	public void Withdraw(int b) {
		//System.out.println("Your total balance is "+ amount);
		int balance = amount - b;
		b =  amount - balance;
		System.out.println("You have withdrawran "+b);
		System.out.println("Your new balance is "+ balance);
		
	}



	public void Deposit(int a) {
		
		amount = a + amount;
		
		System.out.println("Now your new balance is "+ amount);
	}



	public static void main(String[] args) {
		Deposit d1 = new Deposit();
		
		Thread t1 = new Thread(d1);
		
		t1.setName("Ram");
		
		t1.start();

	}

	

}
