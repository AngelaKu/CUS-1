
import java.util.Scanner;
public class ifDemo2 {

	public static void main(String[] args) {
		
		int avg;
		Scanner kb=new Scanner(System.in);
				System.out.print("Enter your average as an integer: ");
		avg=kb.nextInt();
/*
At least 95 is an A
90 to 94 is A-
87-89 is B+
83-86 is B
80-82 is B-
77-79 is C+
73-75 is C
70-72 is C-
65-69 is D+
60-64 is D
Less than 60 is is an F
anything else is invalid entry
 */
		if(avg>=95)
			System.out.println("A");
		else if((avg>=90)&&(avg<=94))
			System.out.println("A-");
		else if((avg>=87)&&(avg<=89))
			System.out.println("B+");
		else if((avg>=83)&&(avg<=86))
			System.out.println("B");
		else if((avg>=80)&&(avg<=82))
			System.out.println("B-");
		else if((avg>=77)&&(avg<=79))
			System.out.println("C+");
		else if((avg>=73)&&(avg<=75))
			System.out.println("C");
		else if((avg>=70)&&(avg<=72))
			System.out.println("C-");
		else if((avg>=65)&&(avg<=69))
			System.out.println("D+");
		else if((avg>60)&&(avg<=64))
			System.out.println("D");
		else if((avg>=0)&&(avg<=60))
			System.out.println("F");
		else
			System.out.println("INVALID ENTRY. AVG MUST BE A POSITIVE INTEGER VALUE");

/*
Enter your average as an integer: 100
A
Enter your average as an integer: 
B+
Enter your average as an integer: 
B
Enter your average as an integer: 
C+
Enter your average as an integer: 
C
Enter your average as an integer: 
C+
Enter your average as an integer: 
C
Enter your average as an integer: 
C-
Enter your average as an integer: 
D+
Enter your average as an integer: 
D
Enter your average as an integer: 
F
Enter your average as an integer: 
INVALID ENTRY. AVG MUST BE A POSITIVE INTEGER VALUE
 */
		
		
		
		
	}

}
