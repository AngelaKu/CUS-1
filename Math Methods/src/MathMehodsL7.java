import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MathMehodsL7 {
	
	public static void main(String[] args)
	{
	System.out.println("The value of e is "+Math.E);
	System.out.println("The value of PI is "+Math.PI);
	double d1= Math.abs(6.7);
	System.out.println("The absolute value of 6.7 is "+d1);
	System.out.println("The absolute value of -6.7 is "+Math.abs(-6.7));
	double d2= Math.log(5);
	System.out.println("The log of 5 is "+d2);
	System.out.println("The square root of 9 is "+Math.sqrt(9));
	double d3=Math.pow(4,3);
	System.out.println("4 to the 3rd power is "+d3);
	System.out.println("23.49 rounded is "+Math.round(23.49));
	int smaller=Math.min(8,2);
	int larger=Math.max(8,2);
	System.out.println("The two numbers are 8 and 2");
	System.out.println("The min of the 2 is "+smaller);
	System.out.println("The larger of the 2 is "+larger);

/* Create the following additional lines of code 
Create a double variable called radius 
Create a Scanner to accept input from the keyboard 
Be sure to import the Scanner 
Ask the user to input the radius value 
Create a formula for area using the Math.PI
Output the area  
Create a double variable called diameter. 
Using the input value for radius above assign the diameter value output
the diameter value create a formula for circumference Using Math.Pi  
Output the value for circumference. 
Try to import the decimal format to create the circumference to have 2 decimal digits 
of precision with leading and floating 0's similar to correct money format but no $ 
*/

	Scanner kb = new Scanner(System.in);
	DecimalFormat df= new DecimalFormat("#0.00");
	
	double radius;
	System.out.print("Enter a radius value as a double: ");
	radius=kb.nextDouble();//will take the next double typed in and store it in radius
	double area=Math.PI*radius*radius;//formula that will use more precise pi value
	System.out.println("Area of the circle with radius "+radius+" is "+area);
	System.out.println("Area of circle with 2 decimal digits of precision is "+df.format(area));
	
	double diameter=radius*2;
	double circumference= Math.PI*diameter;//formula that will use more precise pi value
	System.out.println("The diameter is "+diameter);
	System.out.println("The circumference is "+df.format(circumference));//will output the circumference in our special format


//create a double variable called rate
//get the value from an input statement and assign it to rate
//create an integer value for hours
//get the value from an input statement and assign it to hours
//using the df format above create a new df2 format to look like money with a , and $in the format
//output the salary using the df2 format
	
	double rate;
	System.out.println("Enter the value for the rate as a decimal: ");
	rate=kb.nextDouble();
	
	int hours;
	System.out.println("Enter the hours as an integer: ");
	hours=kb.nextInt();
	
	DecimalFormat df2= new DecimalFormat("$#,##0.00");
	double salary= hours*rate;
	System.out.println("Salary for hours: "+hours+" and rate: $"+rate+" is "+df2.format(salary));
	
//Suppose we wanted to output today's date in the format 02-18-2021
//We would need to create a decimal format that would force the 0 in the 2 digit values that are less than 10 for month and day
//Create 3 integer values for month day and year
//Create a df3 format that will force a 0 in any 2 digit number that is less than 10
//Ask the user to enter in the month day and year
//Output the data using the format shown above
	
	int month, day, year;
	
	DecimalFormat df3=new DecimalFormat("00");
	
	System.out.println("Enter month as an integer: ");
	month=kb.nextInt();
	System.out.println("Enter day as an integer: ");
	day=kb.nextInt();	
	System.out.println("Enter year as an integer: ");
	year=kb.nextInt();
	System.out.println("The date is "+df3.format(month)+"-"+df3.format(day)+"-"+year);
	
//Suppose we wanted to apply df3 for the time to like hours:minutes:secondsAM or PM
//Create 3 integer values for hours minutes and seconds
//Get the values from inputs
//Output the time using the df3 to look like above
//Try time the class starts as 09:05:00AM
	
	int hour, minutes, seconds;
	
	System.out.println("Enter hour as an integer: ");
	hour=kb.nextInt();
	System.out.println("Enter minutes as an integer: ");
	minutes=kb.nextInt();	
	System.out.println("Enter seconds as an integer: ");
	seconds=kb.nextInt();
	System.out.println("Time class starts is "+df3.format(hour)+":"+df3.format(minutes)+":"+df3.format(seconds)+"AM");
	
	
	
	
/*	
The value of e is 2.718281828459045
The value of PI is 3.141592653589793
The absolute value of 6.7 is 6.7
The absolute value of -6.7 is 6.7
The log of 5 is 1.6094379124341003
The square root of 9 is 3.0
4 to the 3rd power is 64.0
23.49 rounded is 23
The two numbers are 8 and 2
The min of the 2 is 2
The larger of the 2 is 8
Enter a radius value as a double: 15.97
Area of the circle with radius 15.97 is 801.2346178049291
Area of circle with 2 decimal digits of precision is $801.23
The diameter is 31.94
The circumference is 100.34
Enter the value for the rate as a decimal: 
29.87
Enter the hours as an integer: 
39
Salary for hours: 39 and rate: $29.87 is $1,164.93
Enter month as an integer: 
2
Enter day as an integer: 
18
Enter year as an integer: 
2021
The date is 02-18-2021
Enter hour as an integer: 
9
Enter minutes as an integer: 
5
Enter seconds as an integer: 
0
Time class starts is 09:05:00AM
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
