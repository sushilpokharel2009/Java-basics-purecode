package modifier.com;

import encapsulation.com.Animal;

public class ModifierSeconds {
	//public, protected and default variable properties are accessed here.Not private.
	
	public static void main(String[] args){
		Modifiers m1 = new Modifiers();
		m1.name ="Ram";
		//m1.age = 12;
		m1.address = "TX";
		m1.height = 5.1;
		System.out.println(m1.name);
		//System.out.println(m1.age);
		Animal a1 = new Animal();
		a1.animalName = "kitty";
		System.out.println(a1.animalName);
	}

}
