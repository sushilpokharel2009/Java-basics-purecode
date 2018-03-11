package com.stosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList();
		li.add("Ram");
		li.add("Hari");
		li.add("Sita");
		li.add("Arjun");
		
		System.out.println("---Before Sorting---");
		for(String l:li){
			System.out.println(l);
		}
		
		System.out.println("---After Soting------");
		Collections.sort(li);
		for(String l:li){
			System.out.println(l);
		}
		
	}

}
