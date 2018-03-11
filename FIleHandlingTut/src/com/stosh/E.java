package com.stosh;

import java.io.File;
import java.io.FileInputStream;

public class E {

	public static void main(String[] args) {
		

		try{
			
			File f = new File("a.txt");
			
			FileInputStream fi = new FileInputStream(f);
			
			String s = "";
			
			while(fi.available() != 0){
				s = s+(char)fi.read();
			}
			
			System.out.println(s);
			
		}catch(Exception e){
			
		}
		

	}

}
