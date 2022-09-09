public class CalculationDemo {
	public static void main(String []args)
	{
		int x = 2 , y = 1;//declare and assign  values for x and y
		int sum = x + y;//declare sum and assign it formula to calculate x+y
		int product = x*y;// declare product and assign it x*y
		int quotient = x / y;//  declare quotient and assign it x/y
		int difference = x - y;//declare difference and assign it x-y
		//below uses the System.out.println to print string literal and the
		//correct formula to output the value determined and return the line
		System.out.println("The sum of x and y is:" + sum);
		//this would also output the sum of x and y
		System.out.println("The sum of x and y is:" +(x+y));// Put formula in the
		// ( ) instead of the variable that represents the formula from above
		System.out.println("The product of x and y is:" + product);
		System.out.println("The quotient of x and y is:" + quotient);
		System.out.println("The difference of x and y is:" + difference);
	}
}

/*
The sum of x and y is:3
The sum of x and y is:3
The product of x and y is:2
The quotient of x and y is:2
The difference of x and y is:1
*/