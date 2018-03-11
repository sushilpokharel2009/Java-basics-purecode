package com.stosh;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class SerializationRead {

	public static void main(String[] args) {
		try{
			File f1 = new File("a.text");
			
			FileReader f2 = new FileReader(f1);
			
			BufferedReader br = new BufferedReader(f2);
			
			System.out.println(br.readLine());
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
