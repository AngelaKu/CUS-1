import java.util.Scanner;

public class nestedIfDemon2 {

	public static void main(String[] args) {
		
	
		int x, y, z;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter x as an integer:");
		x=keyboard.nextInt();
		System.out.print("Enter y as an integer:");
		y=keyboard.nextInt();
		System.out.print("Enter z as an integer:");
		z=keyboard.nextInt();
		
		int max;
		if(x>y)
		{
			if(x>z)
				max=x;
			else
				max=z;
		}
		else
		{
			if(y>z)
				max=y;
			else
				max=z;
		}
		System.out.println("The maximum value of all 3 integers entered: " +x+" "+y+" "+z+" is "+max);
		
/*
Enter x as an integer:7
Enter y as an integer:23
Enter z as an integer:24
The maximum value of all 3 integers entered: 7 23 24 is 24
 */

//Create the nested if that will find the minimum of the 3 integers
//output the minimum value of the 3 integers entered
		
		int a, b, c;
		System.out.print("Enter a as an integer:");
		a=keyboard.nextInt();
		System.out.print("Enter b as an integer:");
		b=keyboard.nextInt();
		System.out.print("Enter c as an integer:");
		c=keyboard.nextInt();
		
		int minimum;
		if(a<b)
		{
			if(a<c)
				minimum=a;
			else
				minimum=c;
		}
		else
		{
			if(b<c)
				minimum=b;
			else
				minimum=c;
		}
		System.out.println("The minimum value of all 3 integers entered: " +a+" "+b+" "+c+" is "+minimum);
		
		
		}
		


	}

