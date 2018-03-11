package com.stosh;

public class B {

	public static void main(String[] args) {

			int a = 6 ;
			System.out.println(a++);
			System.out.println(a);
		
		
		for(int i =  0; i<10;  ++i){
			System.out.println("for-->> "+i);
			
			for(int j=0; j<50; j++){
				System.out.println("j--"+j+"-----"+i);
			}
			
		}
		

		int j = 0;
		while(j<5){
			System.out.println("while-->> "+j);
			++j;
		}
		
		int k = 0;
		do{
			System.out.println(k);
			++k;
		}while(k>5);
		
		
	}

}
