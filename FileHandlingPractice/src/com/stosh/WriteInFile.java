package com.stosh;

import java.io.File;
import java.io.FileOutputStream;

public class WriteInFile {

	public static void main(String[] args) {
		try{
			File f = new File("a.text");
			
			if(!f.exists()){
				f.createNewFile();
			}
			
			String x = "Hello World";
			
			FileOutputStream f1 = new FileOutputStream(f);
			byte[] b = x.getBytes();
			f1.write(b);
			f1.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
