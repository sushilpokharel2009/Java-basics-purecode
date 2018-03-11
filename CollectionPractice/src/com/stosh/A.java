package com.stosh;

import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List <String> l1 = new ArrayList <String>();
			l1.add("Ram");
			l1.add("Hari");
			l1.add("Shyam");
			l1.add("Krish");
			
			System.out.println(l1.get(2));
			
			for(int i = 0; i<l1.size(); i++){
				//System.out.println(l1.get(i));
				System.out.println("-------------");
				System.out.println(l1.get(2));
			}
//			System.out.println("----------");
//			for(String a : l1){
//				System.out.println(a);
//			}

	}

}
