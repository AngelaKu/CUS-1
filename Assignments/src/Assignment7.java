import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		
		int books;
		System.out.print("Enter the number of books you purchased this month as an integer: ");
		books=kb.nextInt();
		
		if(books==0)
			System.out.println("You have 0 points.");
		else if (books==1)
			System.out.println("You have 5 points.");
		else if (books==2)
			System.out.println("You have 15 points.");
		else if (books==3)
			System.out.println("You have 30 points.");
		else if (books>=4)
			System.out.println("You have 60 points.");
		

	}

}
