//create an addTwo method that will display the sum of any 2 integers passed as a void type method
import java.util.Scanner;
public class Methods1 {
public static void main(String[] args)
{
	//here is where you call the definitions
	addTwo (2,3);// since the definition is void type we just call the method
	subTwo (7,5);// and the code will execute and put the display here
	Scanner kb=new Scanner(System.in);
	
	int num1, num2;
	System.out.print("Enter value for num1 ");
	num1=kb.nextInt();
	System.out.print("Enter value for num2 ");
	num2=kb.nextInt();
	addTwo (num1,num2);//method call
	subTwo (num1,num2);//method call
	//in  return type method you must put an output statement with the call because the call
	//will only return a value at that location but to see it must be in an output
	//statement
	System.out.println("The product is "+prodTwo(2,3));
	System.out.println("The quotient is "+regDiv(num1,num2));

	displayDate(4,23,2020);
	System.out.println("Area is "+calcArea(10.5,20.5));
	}
	private static void addTwo(int x, int y)
	{
	System.out.println("Sum is "+(x+y));
	}
	public static void subTwo(int x, int y)
	{
	System.out.println("Difference is "+(x-y));
	}
	//method definition called prodTwo that will return the product of any 2 integers passed as a
	//return type
	public static int prodTwo(int x, int y)
	{
	int prod=x*y;//  OR
	return prod;  //    return (x*y);
	}
	//create a return type method called regDiv that will divide 2 integers as a return type
	public static int regDiv(int x, int y)
	{
	return (x/y);
	}
	//create a method definition as a void that will display today's date in the form
	//month/day/year
	public static void displayDate(int m, int d, int y)
	{
	System.out.println("Today's date is "+m+"/"+d+"/"+y);
	}
	//create a method definition as  a return type called calcArea that will display the area
	//of any 2 doubles passed for length and width
	public static double calcArea(double l, double w)
	{
	return l*w;
	}
	//be sure to use calls in the main method to show these both work

}

