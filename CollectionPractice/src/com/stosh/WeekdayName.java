package com.stosh;

//import java.util.GregorianCalendar;

//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//public class B {
//	public static void main(String[] args){
//		Set <Integer> b = new HashSet<Integer>();
//			b.add(1);
//			b.add(2);
//			b.add(3);
//			b.add(4);
//			
//			for(Integer i : b){
//				System.out.println(i);
//				
//				
//			}
			
//			Date date = new Date();
//			System.out.println(date);
//			
		
		
			
		
			
//	}
//
//}

public class WeekdayName
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%16 == 0 )
				System.out.print(" ********                 \r");
			else if ( i%16 == 1 )
				System.out.print("   ********               \r");
			else if ( i%16 == 2 )
				System.out.print("     ********             \r");
			else if ( i%16 == 3 )
				System.out.print("       ********           \r");
			else if ( i%16 == 4 )
				System.out.print("         ********         \r");
			else if ( i%16 == 5 )
				System.out.print("           ********       \r");
			else if ( i%16 == 6 )
				System.out.print("             ********     \r");
			else if ( i%16 == 7 )
				System.out.print("               ********   \r");
			else if ( i%16 == 8 )
				System.out.print("                 ******** \r");
			else if ( i%16 == 9 )
				System.out.print("               ********   \r");
			else if ( i%16 == 10 )
				System.out.print("             ********     \r");
			else if ( i%16 == 11 )
				System.out.print("           ********       \r");
			else if ( i%16 == 12 )
				System.out.print("         ********         \r");
			else if ( i%16 == 13 )
				System.out.print("       ********           \r");
			else if ( i%16 == 14 )
				System.out.print("     ********             \r");
			else if ( i%16 == 15 )
				System.out.print("   ********               \r");

			Thread.sleep(200);
		}
		
	}
}