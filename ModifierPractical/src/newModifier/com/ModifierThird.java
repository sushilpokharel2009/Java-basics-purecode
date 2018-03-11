package newModifier.com;

import encapsulation.com.Animal;
import method.com.JavaMethod;
import modifier.com.Modifiers;
//By inheritance public and protected variables are accessed with the use of "extend" key word.

public class ModifierThird extends Modifiers{
	
	public static void main(String[] args){
		ModifierThird m1 = new ModifierThird();
		m1.name = "Krishna";
		m1.address = "Gulmi";
		//double and private variables can not be accessed here by inheritance.
		System.out.println(m1.name);
		System.out.println(m1.address);
		
		
		Animal a1 = new Animal();
		a1.setAnimalAge(13);
		int result = a1.getAnimalAge();
		System.out.println(result);
		//return result;
		
		JavaMethod j1 = new JavaMethod();
		 int result1 = j1.sub(3,4);
		 System.out.println(result1);
	}
}
