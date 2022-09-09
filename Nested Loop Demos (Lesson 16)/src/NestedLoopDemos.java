
import java.text.DecimalFormat;
public class NestedLoopDemos {
public static void main(String[] args)
{
	for(int i=1;i<=5;i++)
		{
		//now decide how many times you want to loop the columns for) the inside loop. This will represent
		//what happens for each row
		for(int j=1;j<=10;j++)
			{
			System.out.print(i*j+"\t");
			}
			//still inside the outside loop but now that the inner loop is completed we want to go to the next line
		System.out.println();
		}//closes the outside for loop
	
	//HAND TRACE (above?)
	//i value	test condition		what happens
	//1			1<=5 T				goes inside the other loop
	//										j value		test condition		what happens
	//										1			1<=10 T				prints i*j or 1*1 j goes to 2
	//										2			2<=10 T				prints i*j or 1*2 j goes to 3
	//										3			3<=10 T				prints i*j or 1*3 j goes to 4
	//								continues till j is 11 11<=10 F			This exits the loop
	//	prints a new line or hits an enter i now goes to 2
	//2 		2<=5 T				repeats what we did above until i goes to 6 when it exits the loop
	
	
	//let's look at the time now
	
	DecimalFormat df=new DecimalFormat("00");
	
	for(int hours=1;hours<=12;hours++)//for the hours in the clock this is outer loop
	{
		for(int minutes=0;minutes<60;minutes++)//for the minutes. each hour has 0 through 59 it is inner loop
			{
			for(int seconds=0; seconds<60;seconds++)//for the seconds.  each minute has 0 through 59 it is inner loop
				{
				System.out.print(df.format(hours)+":");
				System.out.print(df.format(minutes)+":");
				System.out.println(df.format(seconds));
				}//closes inner most loop
			}//closes the next inner loop
		}//closes the outer loop
	
	System.out.println();
/* Try to use a nested for loop to print the following
	*
	**
	***
	****
	*****
	
	If you get your example to work try this one next
	
	*****
	****
	***
	**
	*

*/
	
	//first put the number of rows as the outside loop
	
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1; j<=i;j++) // j will loop up to and including the row number
			{
				System.out.print("*");
			}
			System.out.println();
	}
	
	System.out.println();
	
	for(int k=5;k>=1;k--)
	{
		for(int l=1;l<=k;l++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
/*
10:13:59
10:14:00
10:14:01
10:14:02
10:14:03
10:14:04
..... (Too long)
12:59:56
12:59:57
12:59:58
12:59:59

*
**
***
****
*****

*****
****
***
**
*
 */
		
		
			
}	
}


