package com.stosh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {

	public static void main(String[] args) {
		
		Pattern  p = Pattern.compile("[_a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA_Z]+\\.com");
		
		Pattern p1 = Pattern.compile("[a-ZA-Z0-9_!]{5, }");
		
		Matcher m = p.matcher("ram.sharma.nepal@gmail.com");

		
		System.out.println(m.matches());
		
	}

}
