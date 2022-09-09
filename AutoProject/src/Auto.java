import java.util.Scanner;
import java.text.DecimalFormat;
//Lesson 22?

/*
Auto						class
__________________________________________________
-brand:String
-numDoors:int
-prince:double
___________________________________________________
+Auto()
+Auto(String,int,double)
+setBrand(String):void
+getBrand():String
+setNumDoors(int):void
+getNumDoors():int
+setPrice(double):void
+getPrice():double
+getUpgrade():int
+getUpgradePrice():double
+showInfo():void
 */
public class Auto {
	
	Scanner kb=new Scanner(System.in);//include the Scanner here to use anywhere in this code for interaction
	DecimalFormat df=new DecimalFormat("#0.00");
	
	private String Brand;
	private int numDoors;
	private double price;

	public Auto()
		{
			Brand="Ford";
			numDoors=2;
			price=284.56;
		}	
	public Auto(String b,int d, double p)
		{
			Brand=b;
			numDoors=d;
			price=p;
		}
		public void setBrand(String b) 
		{
			Brand=b; //

		}
		public String getBrand()
		{
			return Brand;
		}
		public void setNumDoors(int d)
		{
			numDoors=d;
		}
		public int getNumDoors()
		{
			return numDoors;
		}
		public void setPrice(double p)
		{
			price=p;
		}
		public double getPrice()
		{
			return price;
		}
		public int getUpgrades()
		{
			int numUpgrades;
			
			System.out.println("Enter the number of upgrades: ");
			numUpgrades=kb.nextInt();
			return numUpgrades;
		}
		public double getUpgradePrice()
		{
			System.out.println("What is the price of the update: ");
			double update=kb.nextDouble();
			price=price+update;//will take the price from the Constructor and add the new update and store it in price
			return price;
		}
		public void showInfo()
		{
			System.out.println("Brand:"+Brand);
			System.out.println("Number of doors:"+numDoors);
			System.out.println("Price :$"+df.format(price));
		}
	

}
