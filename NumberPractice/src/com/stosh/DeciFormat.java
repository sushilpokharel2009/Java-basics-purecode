package com.stosh;

import java.text.DecimalFormat;

public class DeciFormat {

	public static void main(String[] args) {
		
		try{
		DecimalFormat d1 = new DecimalFormat("####,##,####.0000");
		
		System.out.println(d1.format(1233333333));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
