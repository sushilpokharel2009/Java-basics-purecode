



import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Do u want 2 start quiz ?");
		
		String a = s1.next();
		
		if(a.equals("yes")){
			
			System.out.println("1:What is the capital city of NEPAL");
			System.out.println("a :KTM");
			System.out.println("b : BKT");
			
			Scanner s2 = new Scanner(System.in);
			System.out.println("Choose your answr :");
			String b = s2.next();
			
			if(b.equals("a"))
			{
				System.out.println("Exact answer, thank you");
			}else if(b.equals("b")){
				System.out.println("Sorry, try again");
				
				
				
			}

		}

	}
}
