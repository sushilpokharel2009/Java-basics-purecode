package com.stosh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class B {	
	
	
	public static void main(String[] args) {
		
		Object o = new Integer(6);
		
		// List     							Set   							Map
		//ArrayList, LinkedList, Vector			HashSet							HashMap
		
		ArrayList li = new ArrayList(); //NonGeneric  //Object
		li.add("Ram");
		li.add(1);
		li.add(true);
		li.add(new B());
		
		for(int i=0; i<li.size(); i++){
			String l = (String)li.get(i);
			System.out.println( li.get(i) );
		}
		
		for(Object l:li)
		{
			String s = (String)l;
		}
		
		List<String> li1 = new LinkedList();  //Generic
		li1.add("Ram");
		li1.add("Hari");
		li1.add("Sita");
		
		String n = li1.get(1);
		
		for(int i=0 ; i<li1.size(); i++){
			System.out.println(li.get(i));
		}
		
		for(String l:li1){
			System.out.println(l);
		}
		
		
		

	}

}
