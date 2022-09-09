
	import java.util.Scanner;
	public class CommonLoopsDemos {
	public static void main(String[] args)
	{
	/*
	* Suppose we wanted to create2 random integer comparisons between the values 1 and
	6,
	* 10 times called d1 and d2 to simulate 2 dice being tossed using a for loop
	*/
		System.out.println("d1\td2");
		for(int i=1;i<=10;i++)
		{
			int d1=(int)(6*Math.random())+1;
			int d2=(int)(6*Math.random())+1;

			System.out.println(d1+"\t"+d2);
		}
	//using a for loop to calculate sum and average
	//using inputs from a keyboard
	/*
	Steps to calculate the sum and average using a loop interactively assuming Scanner is
	imported and created
	Step1 You must assign the first sum to be either 0 or 0.0 depending if working with integers or decimals
	Step 2 Create the loop you want to work with for the calculation
	Step 3 Interactively get a value by asking a question and taking in the input
	Step4 Add that value to the previous sum
	Step 5 Output the sum outside of the loop
	Step 6 You can also output the average outside of the loop
	*/
		
		System.out.println();
		
		Scanner kb=new Scanner(System.in);
		int sum=0;//Step 1
		int numTimes;
		System.out.print("How many integers would you like to calculate the sum of: ");
		numTimes=kb.nextInt();
		for(int i=1;i<=numTimes;i++)//Step 2
		{
			System.out.print("Enter an integer:");//Step3
			int val=kb.nextInt();//Step 3
			sum+=val;//Step 4 same as sum=sum+val;
		}
		System.out.println("Sum is "+sum);//Step 5
		System.out.println("Average is "+(sum)/numTimes);//Step 6
	
	//do the same thing using decimal values
	
		System.out.println();
		
		double sum2=0.0;//Step 1
		int numTimes2;
		System.out.print("How many decimals would you like to calculate the sum of:");
		numTimes2=kb.nextInt();
		System.out.println();
		for(int i=1;i<=numTimes2;i++)//Step 2
		{
			System.out.print("Enter a decimal value:");//Step3
			double val2=kb.nextDouble();//Step 3
			sum2+=val2;//Step 4 same as sum2=sum2+val2;
		}
		System.out.println("Sum is "+sum2);//Step 5
		System.out.println("Average is "+(sum2)/numTimes2);//Step 6
	//using a while loop to print the sum of value for as long as a decimal value is input into
	//the keyboard EG hasNextDouble()
	
	//using the sum of the integers above turn the code into a while loop to get the sum and average
	
		System.out.println();
		
		int sum3=0;
		int val3;
		int numTimes3;
		int j=1;
		System.out.println("Please enter the number of integers you would like to calculate the sum of: ");
		numTimes3=kb.nextInt();
		while(j<=numTimes3)
		{
			System.out.println("Enter an integer: ");
			val3=kb.nextInt();
			sum3+=val3;
			j++;
		}
		System.out.println("Sum is "+sum3);
		System.out.println("Average is "+(sum3)/numTimes3);
		
		System.out.println();
		
		System.out.print("Enter decimal values to create a sum:");
		double total=0.0; //Step1
		while(kb.hasNextDouble())
		//as long as a double value is typed in continue the while loop
		//Eg. Typing in a word will end this loop**********
		{
			double val4=kb.nextDouble();
			total+=val4;
		}
		System.out.println("The sum using the while loop is "+total);
			
		//using charAt()	method to determine how many spaces may be in a String
			
		System.out.println();
		
		int spaces=0;
		String sentence="Today is Thursday.";//T in Today is at the 0 location
		for(int k = 0;k<sentence.length();k++)
		{
			char character=sentence.charAt(k);
			if(character==' ')
			{
				spaces++;
			}
		}
		System.out.println("The sentence is "+sentence);
		System.out.println("The number of spaces in the sentence is "+spaces);
			
		//using what we just looked at how we can calculate the number of vowels a e i o u in a word
		//Create a word as a String assign it the value programming
		//using the above loop calculate the number of vowels in that word
		//Notice it should be 3for 1 o 1 a and 1 i
			
		System.out.println();
		
		String word="programming";
		int aCount=0;//for the number of a's in the word
		for(int l=0;l<word.length();l++)
		{
			char character2=word.charAt(l);
			if(character2=='a')
			{
				aCount++;
			}
		}
		System.out.println("The word is "+word);
		System.out.println("The number of a's in the word is: "+aCount);
		
		//we also need to check or the e the i the o and the u and also if the word has
		//A E I O U as capital letters
		//how can we fix this code so that all vowels will count lowercase and uppercase leter?
			
			
		}
	}
	/*
d1	d2
4	3
5	5
4	3
3	6
5	6
5	3
2	1
1	2
1	4
1	1

How many integers would you like to calculate the sum of:1
Enter an integer:1
Sum is 1
Average is 1

How many decimals would you like to calculate the sum of:1

Enter a decimal value:1.0
Sum is 1.0
Average is 1.0

Please enter the number of integers you would like to calculate the sum of: 
1
Enter an integer: 
1
Sum is 1
Average is 1

Enter decimal values to create a sum:2.0
3.0
end
The sum using the while loop is 5.0

The sentence is Today is Thursday.
The number of spaces in the sentence is 2

The word is programming
The number of a's in the word is: 1

	*/

