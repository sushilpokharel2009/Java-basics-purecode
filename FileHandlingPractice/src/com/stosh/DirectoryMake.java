package com.stosh;

import java.io.File;

public class DirectoryMake {

	public static void main(String[] args) {
		try{
			File f = new File("x");
			
			f.mkdir();
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		

	}

}
