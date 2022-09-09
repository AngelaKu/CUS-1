/*
1. Print the first 20 odd numbers
2. Print your first name 5 times vertically
3. Suppose we want to invest money and want to see how long it will take to double the initial investment
4. We can create a while statement statement that will set up the test to check a balance with the target value (double investment)
5. the balance will increase each year at a rate of 5 percent (0.05)
6. How can we write this code to do this?
 */

public class LoopDemo1 {

	public static void main(String[] args) 
	{
		int i=1;
		while(i<=20)
		{
			System.out.println(2*i-1);
			i++;
		}
		/*
		*/
		
		int j=1;
		while(j<=5)
		{
			System.out.println("Name");
			j++;
		}
		/*
		 */
		double rate=.05;
		double balance= 1000.0;//initial value in the while loop
		double target= 2*balance;
		
		int year=0;
		while(balance<target)
		{
			year++;
			double interest=balance*rate;
			balance=balance+interest;//In short hand notation it is the same as balance+=interest; update	
		}
		System.out.println("The initial value of your investment of 1000.00 doubled after "+year+" years and is worth "+balance);
	}

}
/*
1
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
Name
Name
Name
Name
Name
The initial value of your investment of 1000.00 doubled after 15 years and is worth 2078.928179411367
*/
