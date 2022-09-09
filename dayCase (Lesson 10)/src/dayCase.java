import java.util.Scanner;

public class dayCase {
	
	public static void main(String[] args)
	{
	Scanner kb=new Scanner(System.in);
	int month;
	System.out.print("Enter month as an integer:");
	month=kb.nextInt();
	switch(month)
	{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		{
			System.out.println("31 Days");
			break;
		}
	case 2:
		{
			System.out.println("28 or 29 days depending on Leap Year");
			break;
		}
	case 4: case 6: case 9: case 11:
		{
			System.out.println("30 Days");
			break;
		}
	default:
		{
			System.out.println("IVALID CHOICE. MONTH MUST BE 1 THROUGH 12!");
		}
	}//close off the switch
	
/*
 * CW create a case and switch based on a user entering a number representing a month to see what season it 
 * is. December January February as winter, March April May as Spring, 
 * June July August as Summer, September October and November as Fall.
 */
	int month2;
	System.out.print("Enter the month as an integer to see the season it is in: ");
	month2=kb.nextInt();
	switch(month2)
	{
	case 12: case 1: case 2: 
		{
			System.out.println("Winter");
			break;
		}
	case 3: case 4: case 5:
		{
			System.out.println("Spring");
			break;
		}
	case 6: case 7: case 8:
		{
			System.out.println("Summer");
			break;
		}
	case 9: case 10: case 11:
		{
			System.out.println("Fall");
			break;
		}
		default:
		{
			System.out.println("IVALID CHOICE! The month must be an integer 1 through 12");
		}
		
		
		
	}
	
	}

}
