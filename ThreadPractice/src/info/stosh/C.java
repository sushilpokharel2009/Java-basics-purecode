package info.stosh;

public class C implements Runnable{
	
		@Override
		public void run(){
			for(int i = 0; i<5; ++i){
				System.out.println(Thread.currentThread().getName()+"------"+i);
			}
			
			try{
				//Thread.yield();
				Thread.sleep(8000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	public static void main(String[] args) throws InterruptedException {
		C c1 = new C();
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		
		
		
		t1.setName("Ram");
		t2.setName("Hari");
		
		
		t1.start();
		t1.join();
		t2.start();

	}

}
