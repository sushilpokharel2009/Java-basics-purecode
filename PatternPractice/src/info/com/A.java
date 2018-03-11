package info.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[asd].[nmo]+.[rty]*");
		
		Matcher m = p.matcher("aanooooooooooooftyyyyyyyyyyyyy");
		
		System.out.println(m.matches());

	}

}
