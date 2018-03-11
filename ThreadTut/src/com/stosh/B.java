package com.stosh;

public class B implements Runnable{

	
	@Override
	public void run(){
		
		for(int i = 0; i<15; ++i){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			
			try {
			//	Thread.yield();
				//Thread.sleep(5000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
		
	public static void main(String[] args) throws InterruptedException {

		B b = new B();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		
		t1.setName("Ram");
		t2.setName("Hari");
		
		t1.start();
		t1.join();
		t2.start();
		//t2.join();

	}

	

}
