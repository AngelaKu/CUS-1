import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		int hours;
		double rate;
		
		Scanner kb=new Scanner(System.in);
		
		System.out.print("How many hours did you work? ");
		hours=kb.nextInt();
		
		System.out.print("What was the rate? ");
		rate=kb.nextDouble();
		
		double salary = hours*rate;
		
		System.out.println("The hours, rate, and salary are: \nhours\t"+hours+"\nrate\t"+rate+"\nsalary\t"+"$"+salary);
		
/*
How many hours did you work? 4
What was the rate? 5
The hours, rate, and salary are: 
hours	4
rate	5.0
salary	$20.0
 */

	}

}
