package info.com;

public class A {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 2;
		int d = 2;
		Integer e = new Integer(2);
		Integer f = new Integer(2);
		System.out.println(a == b);
		System.out.println(b == a);
		System.out.println(c == d);
		System.out.println(d == c);
		System.out.println(e == f);
		System.out.println(f == e);
		System.out.println(e == d);
		d = f;
		System.out.println(d);
		System.out.println(e.equals(f));
		System.out.println(e.equals(a));
		System.out.println(e.equals(d));
		//System.out.println(b.equals(f));
		

	}

}
