import java.util.Scanner;

public class DueMarch25 {

	public static void main(String[] args) 
	{
	
		//#2
		Scanner kb=new Scanner(System.in);

			double rate=100.0;
			double balance= 100.0;
			double car= 5000.0;
	
			
			System.out.print("How many deposits will you enter: ");
			int d=kb.nextInt();
		
			while(balance==100.0)
			{
				double interest=d*rate;
				balance+=interest;
			}
			double j=(car/100)-d;
			
			System.out.println("The car costs $"+car+".\nYou have $"+balance+".\nYou need "+j+" more deposits");
			
			
		}
		
		
	}


