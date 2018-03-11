package com.stosh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date d1 = new Date();
		
		System.out.println(d1);
		
		
		
		SimpleDateFormat sf = new SimpleDateFormat("MM/YYYY/dd:hh:ss");
		
		System.out.println(sf.format(d1));

	}

}
