import java.util.Scanner;
public class calcAverag {
	public static double calcAverage(double one, double two, double three)
	{
		System.out.print("Enter three double tests: ");
		Scanner kb = new Scanner(System.in);

		double val=(one+two+three)/3;
		return val;
	
	}
}
/*
Enter a double: 3.2
Enter a double: 1.6
Enter a double: 5.4
The average is: 3.40
*/
