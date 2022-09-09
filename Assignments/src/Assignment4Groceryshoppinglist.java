import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment4Groceryshoppinglist {

	public static void main(String[] args) {
		
		double Milk = 2.99;
		double Soda = 1.99;
		double Bread = 2.59;
		double Water = 4.29;
		
		int numMilk;
		int numSoda;
		int numBread;
		int numWater;
		
		System.out.println("Welcome to My Grocery Store Today's Specials are: \nMilk\t"+Milk+"\nSoda\t"+Soda+"\nBread\t"+Bread+"\nWater\t"+Water);
		
		System.out.print("How much milk will you buy? ");
		Scanner kb=new Scanner(System.in);
		numMilk=kb.nextInt();
		
		System.out.print("How much soda will you buy? ");
		numSoda=kb.nextInt();
		
		System.out.print("How much bread will you buy? ");
		numBread=kb.nextInt();
		
		System.out.print("How much water will you buy? ");
		numWater=kb.nextInt();
		
		
		double totalMilk = Milk*numMilk;
		double totalSoda = Soda*numSoda;
		double totalBread = Bread*numBread;
		double totalWater = Water*numWater;
		
		double totalamount = totalMilk+totalSoda+totalBread+totalWater;
		
		System.out.println("Total: $"+totalamount);
		
		double tax = 0.085;
		
		double totaltax = totalamount*tax;
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("Tax: "+df.format(totaltax));
		
		double totalbill = totalamount+totaltax;
		DecimalFormat df2=new DecimalFormat("$#,##0.00");
		
		System.out.println("Total with tax: "+df2.format(totalbill));
		
		int time1, time2;
		time1=11;
		time2=39;
		System.out.println("Time: "+time1+":"+time2);
		
		int month, day, year; 
		month=2;
		day=17;
		year=2021;
	
		System.out.println("Date: "+month+"/"+day+"/"+year);
		

	}

}
/*
Welcome to My Grocery Store Today's Specials are: 
Milk	2.99
Soda	1.99
Bread	2.59
Water	4.29
How much milk will you buy? 1
How much soda will you buy? 2
How much bread will you buy? 3
How much water will you buy? 4
Total: $31.9
Tax: 2.71
Total with tax: $34.61
Time: 11:39
Date: 2/17/2021
*/
