package random.com;

public class A {
	String firstName;
	String lastName;
	int age;
	String gender;
	boolean isMarried;
	
	
	

	public A(String firstName, String lastName, int age, String string,
			boolean isMarried) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = string;
		this.isMarried = isMarried;
	}




	public static void main(String[] args) {
		
		A a1 = new A("a", "b", 12, "m", true);
	}

}
