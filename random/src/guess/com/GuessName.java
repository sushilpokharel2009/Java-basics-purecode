package guess.com;

import java.util.Scanner;

public class GuessName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
//		String name = "Ram";
//
//		//System.out.println("WELCOME TO THE BANK OF MITCHELL.");
//		System.out.print("ENTER YOUR GUESSING NAME: ");
//		String entry = keyboard.toString();
//
//		while ( entry != name )
//		{
//			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
//			System.out.print("ENTER YOUR PIN: ");
//			entry = keyboard.toString();
//		}
//
//		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		
		
		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.next();

		int n = 0;
		while ( n < 5 )
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}


	}

}
