package circle;

public class CircleDemo {

	public static void main(String[] args) {
		
		double radius = 20.55;
		double PI = 3.14;
		
		double diameter =2*radius;
		double circumference =2*PI*radius;
		double area =PI*radius*radius;
		
		System.out.println("The circle has radius "+radius);
		System.out.println("The circle has diameter "+diameter);
		System.out.println("The circumference of the circle is "+circumference);
		System.out.println(area+" is the area of the circle");
		
/*
The circle has radius 20.55
The circle has diameter 41.1
The circumference of the circle is 129.054
1326.0298500000001 is the area of the circle
 */

	}

}
