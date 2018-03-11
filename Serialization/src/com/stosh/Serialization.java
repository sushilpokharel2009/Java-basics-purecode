package com.stosh;

import java.io.File;
import java.io.FileWriter;

public class Serialization {

	public static void main(String[] args) {
		try{
			
			File f = new File("a.text");
			
			if(!f.exists()){
				f.createNewFile();
			}
			
			String a = "Hello Java";
			
			FileWriter fw = new FileWriter(f);
			fw.write(a);
			fw.close();
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
