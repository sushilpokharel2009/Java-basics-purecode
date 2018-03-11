package com.stosh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class F {

	public static void main(String[] args) {
		
		try{
			
			File f = new File("b.txt");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			System.out.println(br.readLine());
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
