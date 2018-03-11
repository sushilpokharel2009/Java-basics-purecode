package com.stosh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d);
		
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MMM-dd");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy/MMMM/dd W hh:mm:ss a");
		
		System.out.println(sf1.format(d));
		System.out.println(sf2.format(d));

	}

}
