package modifier.com;

public class Modifiers {
	public String name;
	private int age;
	protected String address;
	double height;
	//all modifiers are accessed here.
	
	public static void main(String[] args){
		Modifiers m1 = new Modifiers();
		m1.name ="Ram";
		m1.age = 12;
		m1.address = "TX";
		m1.height = 5.1;
		System.out.println(m1.name);
	}
}
//public: accessed anywhere.
//private:accessed within the same class only. can not be inherited but by encapsulation it can be accessed.

//{protected: accessed within the same package only.
//By inheritance, with key word"extend" it can be accessed anywhere.}

//default: accessed within the same package only. can not be inherited.