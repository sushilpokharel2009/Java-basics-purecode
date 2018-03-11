package weekdays;

public class dayNames {
	
	public static String days_names(int day){
	 String result;
		
		if(day == 1){
			result = "Sunday";
		}
		
		else if(day == 2){
			result = "Monday";
			
		}
		else if(day == 3){
			result = "Tuesday";
			
		}
		else if(day == 4){
			result = "Wednesday";
			
		}
		else if(day == 5){
			result = "Thursday";
			
		}
		else if(day == 6){
			result = "Friday";
			
		}
		else if(day == 7){
			result = "Saturday";
			
		}
		else{
			result = "Return nothing";
		}
		return result;
		
	}
	
	public static void main(String[] args){
		System.out.println("Day1 is:" + days_names(1));
		System.out.println("Day2 is:" + days_names(2));
		System.out.println("Day3 is:" + days_names(3));
		System.out.println("Day4 is:" + days_names(4));
		System.out.println("Day5 is:" + days_names(5));
		System.out.println("Day6 is:" + days_names(6));
		System.out.println("Day7 is:" + days_names(7));
	}

}
