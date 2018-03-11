package com.stosh;

import java.io.File;

public class B {

	public static void main(String[] args) {
		
		try{
			
			File f = new File("x/y/z");
			f.mkdirs();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
