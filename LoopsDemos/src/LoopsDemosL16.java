import java.util.*;

public class LoopsDemosL16 {
public static void main(String[] args) 
	{
	int i, j, k;
	//These first 2 are pre test loops and will test condition first and only execute if true 
	for (i=1; i<=3; i++) //here i begins at 1 will continue for and include 3 times increasing by 1 each time
		{
		System.out.println("Using for loop "+i);
		}
	j=1; //give initial j value
	while (j<=3) //test condition first to see if less than or equal to 3 and if true do what's in { }
		{
		System.out.println("Using a while statement "+j);
		j++;//increase the j by one each time then go to top to retest the condition with new value
		}
	//This is a post test loop. It will always at least one time execute even if condition is false
	k=1; //give initial k value
	do //do the following code in { } first then test the condition
		{
		System.out.println("Using a do..while loop "+k);
		k++;//increment the k by one
		}
	while
	(k<=3); //now test the condition to see if less or equal to 3 ONLY one with ; after the }
	int choice;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter your choice an integer between 1 and 10");
	choice = keyboard.nextInt();
	for(i = 1; i<=choice; i++)
		{
		System.out.println("Hi");
		}
	int answer;
	j=1;
	System.out.println("Enter how many times you would like to loop something: ");
	answer=keyboard.nextInt();
	while
	(j<=answer)
		{
		System.out.println("Now looping "+j+ " times");
		j++;
		}
	//I will now illustrate the do..while loop using a question to continue
	int guess1;
	String guess2;
	int lucky_number;
	do
		{
		System.out.println("Please enter a number between 1 and 10 to see if it is the lucky number:");
		guess1=keyboard.nextInt();
		lucky_number= (int)(10*Math.random()+1);
		if(guess1==lucky_number)
			{
			System.out.println("You picked the lucky number "+lucky_number);
			}
	else
		System.out.println("Sorry you did not pick the lucky number "+lucky_number);
		System.out.println("Would you like to try to guess again yes or no");
		guess2=keyboard.next();
		}
	while(guess2.equalsIgnoreCase("yes"));
	System.out.println("Hope you like working with loops!");
	}//ends the main function
}//ends the class

/*
Using for loop 1
Using for loop 2
Using for loop 3
Using a while statement 1
Using a while statement 2
Using a while statement 3
Using a do..while loop 1
Using a do..while loop 2
Using a do..while loop 3
Enter your choice an integer between 1 and 10
4
Hi
Hi
Hi
Hi
Enter how many times you would like to loop something: 
3
Now looping 1 times
Now looping 2 times
Now looping 3 times
Please enter a number between 1 and 10 to see if it is the lucky number:
2
Sorry you did not pick the lucky number 3
Would you like to try to guess again yes or no
yEs
Please enter a number between 1 and 10 to see if it is the lucky number:
5
Sorry you did not pick the lucky number 10
Would you like to try to guess again yes or no
yes
Please enter a number between 1 and 10 to see if it is the lucky number:
7
Sorry you did not pick the lucky number 6
yes
Please enter a number between 1 and 10 to see if it is the lucky number:
6
Sorry you did not pick the lucky number 4
Would you like to try to guess again yes or no
YES
Please enter a number between 1 and 10 to see if it is the lucky number:
2
Sorry you did not pick the lucky number 8
Would you like to try to guess again yes or no
no
Hope you like working with loops!
 */

