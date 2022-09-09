/*
 * Create a class called AutoTester. Create an object cl of the Auto class using the no argument constructor.
 * Use the showInfo to display the values. Then call the getUpgrades() and put in any value you choose.
 * Display this update. Then call the getUpgradePrice and put in any value you choose
 * Display this update price
 Create an object c2 pass any values you want at the time of object creation.
 Call the showInfo()
 */

import java.text.DecimalFormat;

public class AutoTester {
public static void main(String[]args) 
{
	DecimalFormat df=new DecimalFormat("#0.00");
	Auto c1=new Auto();
	c1.showInfo();
	System.out.println("The number of upgrades is: "+c1.getUpgrades());
	System.out.println("The new updated price is: "+df.format(c1.getUpgradePrice()));
	
	System.out.println();
	System.out.println();
	
	Auto c2=new Auto("Honda", 4, 296.78);
	c2.showInfo();
	
}
}
/*
Brand:Ford
Number of doors:2
Price :$284.56
Enter the number of upgrades: 
2
The number of upgrades is: 2
What is the price of the update: 
40.56
The new updated price is: 325.12


Brand:Honda
Number of doors:4
Price :$296.78
*/