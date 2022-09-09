import java.util.Random;
import java.util.Scanner;

public class Assignment7part2 {

	public static void main(String[] args) {
		
		System.out.println("We are going to play a game of rock paper scissors.");
		System.out.print("Please choose 1 for Rock, 2 for Paper or 3 for scissors: ");
		Scanner kb=new Scanner(System.in);
		int yourChoice;
		yourChoice=kb.nextInt();
		
		Random computerChoice =new Random();
		int compChoice=computerChoice.nextInt(3);
		
		int Rock, Paper, Scissors;
		Rock=1;
		Paper=2;
		Scissors=3;
		
		if ((yourChoice==Rock && compChoice==Scissors)||(yourChoice==Paper && compChoice==Rock)||(yourChoice==Scissors && compChoice==Paper))
			System.out.println("You lose");
		else if ((yourChoice==Rock && compChoice==Paper)||(yourChoice==Paper && compChoice==Scissors)||(yourChoice==Scissors && compChoice==Rock))
			System.out.println("You lose");
		else 
			System.out.println("You tie");
				
		
		
		System.out.println("You chose "+yourChoice+" and the computer chose "+compChoice);
	}

}

