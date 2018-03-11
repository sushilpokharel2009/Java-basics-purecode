package com.stosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class B {

	public static void main(String[] args) {
		A a1 = new A(1,4,"Ram","Ktm","Sital");
		A a2 = new A(4,1,"Rams","Btm","Mital");
		A a3 = new A(6,5,"Tom","Ktm","Hari");
		A a4 = new A(8,3,"Gary","Ktm","Krish");
		A a5 = new A(2,2,"Sam","Ktm","Sita");
		A a6 = new A(7,6,"Simon","Ktm","Bishnu");
		
		
			List<A> li = new ArrayList<A>();
			li.add(a1);
			li.add(a2);
			li.add(a3);
			li.add(a4);
			li.add(a5);
			li.add(a6);
			
			Comparator<A> c1 = new Comparator<A>() {

				public int compare(A a1, A a2){
					
					//return this.id - a1.id;
					//return this.rollNo - a1.rollNo;
					//return this.name.compareTo(a1.name);
					//return this.address.compareTo(a1.address);
					return a1.teacherName.compareTo(a2.teacherName);
					
				}
				
			};
			
			Comparator<A> c2 = new Comparator<A>() {

				public int compare(A a1, A a2){
					
					//return this.id - a1.id;
					//return this.rollNo - a1.rollNo;
					//return this.name.compareTo(a1.name);
					return a1.address.compareTo(a2.address);
					//return a1.teacherName.compareTo(a2.teacherName);
					
				}
				
			};
			
			
			Comparator<A> c3 = new Comparator<A>() {

				public int compare(A a1, A a2){
					
					//return this.id - a1.id;
					//return this.rollNo - a1.rollNo;
					return a1.name.compareTo(a2.name);
					//return this.address.compareTo(a1.address);
					//return a1.teacherName.compareTo(a2.teacherName);
					
				}
				
			};
			
			Collections.sort(li, c1);
			for(A c:li){
				System.out.println(c);
			}
		
			Collections.sort(li, c2);
			for(A c:li){
				System.out.println(c);
			}
			
			
		}
	}
	


