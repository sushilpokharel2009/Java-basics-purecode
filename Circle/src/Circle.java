class CircleArea{
	double radius;
	double area;
	
	public double findCircleArea(double radius){
		//radius;
		//area = a;
		area = radius * radius *3.14;
		//area = radius * radius * 3.14;
		System.out.println(area);
		return area;
	}
	
	public void findCircleArea1(double r){
		radius = r;
		area = radius * radius * 3.14;
		System.out.println(area);
		
	}
	public double getRemainder(double a, double b){
		double result =  a% b;
		return  result;
	}
}


public class Circle {
	
	public static void main(String[] args){
		CircleArea c1 = new CircleArea();
//		double result = c1.findCircleArea(3.5);
//		System.out.println(result);
//		CircleArea c2 = new CircleArea();
//		c2.findCircleArea1(5);
		double result3 = c1.getRemainder(5, 4);
		System.out.println(result3);
	}
}
