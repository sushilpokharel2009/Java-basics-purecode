package com.stosh;

import java.io.File;
import java.io.FileOutputStream;

public class C {

	public static void main(String[] args) {
		
		try{
			
			File f = new File("a.txt");
			
			if(!f.exists()){
				f.createNewFile();
			}
			
			String s = "This is java";
			
			FileOutputStream fo = new FileOutputStream(f);
			
			byte[] b = s.getBytes();
 			
			fo.write(b);;
			
			fo.close();
			
			
			
		}catch(Exception  e){
			e.printStackTrace();
		}
		
	}

}
