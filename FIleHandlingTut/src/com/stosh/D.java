package com.stosh;

import java.io.File;
import java.io.FileWriter;

public class D {

	public void abc(){
		try{
			
			File f = new File("b.txt");
			
			if(!f.exists()){
				f.createNewFile();
			}
			
			String s = "THis is javaClass";
			
			FileWriter fw = new FileWriter(f);
			fw.write(s);
			
			fw.close();
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		D d =new D();
		d.abc();
			

	}

}
