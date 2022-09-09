/*
Create a project in Eclipse called ifDemo3 with a class with the same name
Create a main method
The program will have a decimal variable called temp
Have the user enter in a temp for temperature
value
It will output the following
Greater than 80 Hot
70-79 Warm
50-69 Cool
30-49 Cold
Less than 30 frigid (You will use this a the last else so no need to test it with an if)
 */
import java.util.Scanner;
public class ifDemo3 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		double temp;
		
		System.out.print("Enter the temperature as a double to see the type of weather: ");
		temp=kb.nextDouble();
		if(temp>=80)
			System.out.println("Hot");
		else if(temp>70&&temp<79)
			System.out.println("Warm");
		else if(temp>50&&temp<69)
			System.out.println("Cool");
		else if(temp>30&&temp<49)
			System.out.println("Cold");
		else
			System.out.println("Frigid");
	}

}
/*
Enter the temperature as a double to see the type of weather: 75.4
Warm
Enter the temperature as a double to see the type of weather: 95.3
Hot
Enter the temperature as a double to see the type of weather: 57.8
Cool
Enter the temperature as a double to see the type of weather: 46.0
Cold
Enter the temperature as a double to see the type of weather: -2.3
Frigid
 */
