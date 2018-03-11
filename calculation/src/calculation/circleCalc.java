package calculation;

public class circleCalc {
	
	public static double area_circle(int radius){
		double pi = 22/7;
		double calc = pi*radius*radius;
		
		return calc;
	}
	public static void main(String[] args){
		System.out.println(area_circle(5));
	}
}
  