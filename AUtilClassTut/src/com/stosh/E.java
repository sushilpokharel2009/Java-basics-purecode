package com.stosh;

import java.text.DecimalFormat;

public class E {

	public static void main(String[] args) {
			
		DecimalFormat df1 = new DecimalFormat("###,###.####");
		DecimalFormat df2 = new DecimalFormat("###,###.00000");
		
		
		System.out.println(df1.format(5555555555.55000));
		System.out.println(df2.format(5555555));
	}

}
