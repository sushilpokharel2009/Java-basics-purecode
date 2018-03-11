package com.stosh;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class B {

	public static void main(String[] args) {
		
		try{
			
			FileInputStream fi = new FileInputStream("s.dat");
			
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Student s1 = (Student)oi.readObject();
			
			System.out.println(s1.getName()+"----"+s1.getAddress());
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

		

	}

}
