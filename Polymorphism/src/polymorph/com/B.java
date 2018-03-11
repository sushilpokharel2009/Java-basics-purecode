package polymorph.com;

public class B {

	public static void main(String[] args) {
		A a2 = new A();
		a2.name ="Bina";
		a2.age = 15;
		a2.zone = "Gandaki";
		
		System.out.println("1------------------------------------");
		System.out.println(a2.name);
		System.out.println(a2.age);
		System.out.println(a2.zone);
		System.out.println("11------------------------------------");
		System.out.println(a2.age);
		System.out.println(A.zone);
		
		
		
		a2.def();
		System.out.println("a2.def------------------------------------");
		System.out.println(a2.name);
		System.out.println(a2.age);
		System.out.println(a2.zone);
		System.out.println(a2.age);
		
		a2.abc();
		System.out.println("a2.abc------------------------");
		System.out.println(a2.name);
		System.out.println(a2.age);
		System.out.println(a2.zone);
		System.out.println(a2.age);
		
		a2.def();
		System.out.println("a2.def------------------------------------");
		System.out.println(a2.name);
		System.out.println(a2.age);
		System.out.println(a2.zone);
		System.out.println(a2.age);
		
		A.def();
		System.out.println("A.def------------");
		System.out.println(a2.name);
		//System.out.println(a1.name);
		System.out.println(a2.age);
		System.out.println(a2.zone);
		//System.out.println(a1.age);
		
		
		a2.abc();
		System.out.println("a2.abc------------------------------------");
		System.out.println(a2.name);
		System.out.println(a2.age);
		System.out.println(a2.zone);
		System.out.println(a2.age);
		
		
		A.def();
		System.out.println("A.def------------------------------------");
		System.out.println(a2.name);
		//System.out.println(a1.name);
		System.out.println(a2.age);
		System.out.println(a2.zone);
		//System.out.println(a1.age);
		
		
		
		

	}

}
