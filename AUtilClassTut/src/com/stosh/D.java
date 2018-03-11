package com.stosh;

import java.text.NumberFormat;
import java.util.Locale;

public class D {

	public static void main(String[] args) {
		
		Locale l1 = new Locale("en", "GB");
		Locale l2 = new Locale("fr", "CA");
		Locale l3 = new Locale("np", "NP");
		
		NumberFormat nf1 = NumberFormat.getInstance(l1);
		NumberFormat nf2 = NumberFormat.getInstance(l2);
		NumberFormat nf3 = NumberFormat.getInstance(l3);
		
		System.out.println(nf1.format(10.50));
		System.out.println(nf2.format(10.50));
		System.out.println(nf3.format(10.50));
		
		
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(l1);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(l2);
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(l3);
		
		System.out.println(nf4.format(10.50));
		System.out.println(nf5.format(10.50));
		System.out.println(nf6.format(10.50));
		
	}

}
