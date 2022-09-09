
import java.util.Scanner;

public class Conditions1 {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		
		int age;
		
		System.out.print("Enter your age as an integer to see if you can register to vote: ");
		age=kb.nextInt();
		
		if(age>=18)
			System.out.println("You can register to vote.");
		else
			System.out.println("Sorry you can't register. You must be at least 18 and your age is "+age);
		
/*
First try:
Enter your age as an integer to see if you can register to vote: 18
You can register to vote.
Second Try:
Enter your age as an integer to see if you can register to vote: 17
Sorry you can't register. You must be at least 18 and your age is 17
*/
		
		
//Create the grade variable. Get the value interactively as an integer
//Test to see if the grade is at most 60 and output you fail if it is, otherwise you pass
		
		int grade;
		System.out.println("Enter grade as an integer");
		grade=kb.nextInt();
		
		if(grade<=60)
			System.out.println("You fail.");
		
			else
			System.out.println("You pass.");
/*
First Try
Enter grade as an integer
60
You fail.
Second Try
Enter grade as an integer
80
You pass
 */
		
//Create 2 variables an integer for credits and a double for gpa.
//display you can apply to the honor society if credits at least 60 and gpa at least 3.7
//otherwise display sorry you can't apply
		
		int credits;
		double gpa;
		System.out.print("Enter number of credits completed as an integer ");
		credits=kb.nextInt();
		System.out.print("Enter gpa as a double ");
		gpa=kb.nextDouble();
		
		if((credits>=60)&&(gpa>=3.7))
			System.out.println("You can apply to the honor system");
		else
			System.out.print("Sorry you can't apply. You must have at least 60 credits completed and a gpa of 3.7. \nYou have "+credits+" credits and a "+gpa+" gpa");
/*
First Try
Enter number of credits completed as an integer 75
Enter gpa as a double4.2
You can apply to the honor system
Second Try
Enter number of credits completed as an integer 50
Enter gpa as a double 2.1
Sorry you can't apply. You must have at least 60 credits completed and a gpa of 3.7. 
You have 50 credits and 2.1 gpa"
 */
		
		
// Create a variable called age2. interactively get the age2
//Output free admission if age2 is less than 2 or greater than 65
		
int age2;
System.out.println("Enter your age as an integer to see cost of admission: ");
age2=kb.nextInt();
if((age2<2)||(age2>65))
	System.out.println("Your admission is free.");
	else
		System.out.println("Your admission is full price. \n You must be less than 2 years or greater than 65 for free admission and you are "+age2);

/*
First Try
Enter your age as an integer to see cost of admission: 
18
Your admission is full price. 
 You must be less than 2 years or greater than 65 for free admission and you are 18
Second Try
Enter your age as an integer to see cost of admission:
1
Your admission is free.
 */
//Create a variable called score and interactively get the score		
//Output perfect score if the score is exactly 104

int score;
System.out.println("Enter your score on the first test: ");
score=kb.nextInt();
if(score==104)
	System.out.println("Perfect score!");
else
	System.out.println("Not a perfect score. A perfect score is 104 and your score is "+score);
/*
First Try
Enter your score on the first test: 
104
Perfect score!
Second Try
Enter your score on the first test: 
100
Not a perfect score. A perfect score is 104 and your score is 100
 */
		
	}

}
/*
Enter your age as an integer to see if you can register to vote: 18
You can register to vote.
Enter grade as an integer
80
You pass.
Enter number of credits completed as an integer 65
Enter gpa as a double 3.9
You can apply to the honor system
Enter your age as an integer to see cost of admission: 
18
Your admission is full price. 
 You must be less than 2 years or greater than 65 for free admission and you are 18
Enter your score on the first test: 
100
Not a perfect score. A perfect score is 104 and your score is 100
 */

