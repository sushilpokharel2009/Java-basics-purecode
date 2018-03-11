package random;

import java.util.Random;

public class findRandom {
	public static void main(String[] args){
		Random r = new Random();
		int x = 1+ r.nextInt(100);
		System.out.println(x);
		System.out.println(1 + r.nextInt(100));
		
		
		
	}
}
