package polymorph.com;

public class A {
	public String name;
	public  int age;
	public static String zone;
	
	public void abc(){
		name = "Krish";
		age = 12;
		zone = "Lumbini";
	}
	
	public static void def(){
		A a1 = new A();
		a1.name = "sita";
		a1.age = 13;
		a1.zone = "Narayani";
		
	}

}
