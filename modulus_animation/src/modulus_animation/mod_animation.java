package modulus_animation;

public class mod_animation {
	
	public static void main(String[] args){
		int x = 10;
		int y = 2;
		
		for(int i = 0; i<x*100; i++){
			if(i%10 == 0){
				System.out.println("*****");
			}
			
			if(i%11 == 1){
				System.out.println(".*******");
			}
		}
	}
}
