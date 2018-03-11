import java.text.*;
import java.util.*;


class ExampleDate{
	public void getDate(){
		 Date dNow = new Date( );
		 System.out.println("Unformated Date" + dNow);
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date: " + ft.format(dNow));
	}
}
public class Loop {
	public static void main(String[] args){
		//for loop
		for (int i = 0; i <= 10; i++){
			System.out.println (i + 1);
		}
		
		int loopCount = 20;
		int num = 0;
		for (int i = 0; i < loopCount; i++){
			num = num +i;
			System.out.println(num);
		}
		
		//foreach loop
		String[] fruits = {"apple", "banana", "orange", "pears", "mango", "pineapple", "cherry","grapes", "apricot", "kiwi"};
		for(String fruitNames : fruits){
			System.out.println(fruitNames);
			
		}
		
		//array
		String[] names = {"Ram", "Hari", "Krish", "Shiva", "Binod"};
		String name = names[2];
		System.out.println(name);
		
		ExampleDate date = new ExampleDate();
		date.getDate();
	}

}
