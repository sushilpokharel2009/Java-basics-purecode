package com.stosh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class A {

	public static void main(String[] args) {
		try{

		Student s1 = new Student();
		s1.setName("Ram");
		s1.setAddress("Ktm");
		
		FileOutputStream fi = new FileOutputStream("s.dat");
		ObjectOutputStream oi = new ObjectOutputStream(fi);
		
		 oi.writeObject(s1);
		
		 oi.close();
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
