package Inherit.com;

import Const.com.ConstA;
import Const.com.ConstB;

public class InheritA {

	public static void main(String[] args) {
		ConstA a1 = new ConstA("Ram", 20);
		a1.name = "Rita";
		a1.age = 20;
		//a1.rollNo = 5;
		System.out.println(a1.name + " is " + a1.age + " years old.");
		
		int r1 = a1.addIncome(200, 500);
		System.out.println("Total income is: " + r1);
		
		ConstB b1 = new ConstB("Shyam", 22);
		b1.rollNo = 1;
		System.out.println(b1.name + " is " + b1.age + " years and his roll number is " + b1.rollNo);
		
		int r2 =  b1.addIncome(12324, 500);
		System.out.println("His income is: " + r2);
		
		
		
		
		 b1.setNewYearSalary(2233434);
		 int r5 = b1.getNewYearSalary();
		 System.out.println("New year salary is: " + b1.getNewYearSalary());
		 
		 b1.setNewYearBonus(101);
		 int r3 = b1.getNewYearBonus();
		 System.out.println("New year bonus is: " + r3);
		

	}

}
