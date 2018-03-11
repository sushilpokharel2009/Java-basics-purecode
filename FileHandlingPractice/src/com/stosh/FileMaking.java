package com.stosh;

import java.io.File;

public class FileMaking {
	public static void main (String[] args){
	
		try{
			File f = new File("a.text");
			f.createNewFile();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
