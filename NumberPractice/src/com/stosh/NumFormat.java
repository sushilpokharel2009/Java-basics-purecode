package com.stosh;

import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat {

	public static void main(String[] args) {
		
		
		Locale l1 = new Locale("en","GB");
		Locale l2 = new Locale("fr","CA");
		Locale l3 = new Locale("np","NP");
		Locale l4 = new Locale("ja","JP");
		
		
		
		NumberFormat nf1 = NumberFormat.getInstance(l1);
		NumberFormat nf2 = NumberFormat.getInstance(l2);
		NumberFormat nf3 = NumberFormat.getInstance(l3);
		NumberFormat nf4 = NumberFormat.getInstance(l4);
		
		
		System.out.println(nf1.format(10.12));
		System.out.println(nf2.format(10.12));
		System.out.println(nf3.format(10.12));
		System.out.println(nf4.format(10.12));
		
		
		
		System.out.println("----------------------------");
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(l1);
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(l2);
		NumberFormat nf7 = NumberFormat.getCurrencyInstance(l3);
		NumberFormat nf8 = NumberFormat.getCurrencyInstance(l4);
		
		
		
		System.out.println(nf5.format(10.12));
		System.out.println(nf6.format(10.12));
		System.out.println(nf7.format(10.12));
		System.out.println(nf8.format(10.12));

	}

}
