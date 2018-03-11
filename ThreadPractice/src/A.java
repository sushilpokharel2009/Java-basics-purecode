
public class A implements Runnable {

	

	@Override
	public void run(){
	
		for(int i = 0; i<15; i++){
		System.out.println(Thread.currentThread().getName() + "--------" + i);
		}
	}

	public static void main(String[] args) {
		A a1 = new A();
		
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		
		t1.setName("Ram");
		t2.setName("Hari");
		
		
		t1.start();
		t2.start();
	}

}
