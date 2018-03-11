package com.stosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student(5, "Ram", "Ktm");
		Student s2 = new Student(3, "Hari", "Brt");
		Student s3 = new Student(7, "Gita", "Bkt");
		Student s4 = new Student(1, "ZArjun", "Dharan");

	//	System.out.println(s1.id +"--"+ s1.name);
		//System.out.println(s2);
		
		
		List<Student> li = new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		
//		System.out.println("--Before Sorting-----");
//		for(Student s:li){
//			System.out.println(s);
//		}
		
		System.out.println("---After Sorting----");
		Collections.sort(li);
		for(Student x:li){
			System.out.println(x);
		}
		
	}

}
