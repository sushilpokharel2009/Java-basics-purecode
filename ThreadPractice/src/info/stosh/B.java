package info.stosh;

public class B extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "---------"
					+ i);
		}
	}

	public static void main(String[] args) {

		B b1 = new B();

		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		t1.setName("X");
		t2.setName("Y");
		t3.setName("Z");
		t1.start();
		t2.start();
		t3.start();

	}

}
