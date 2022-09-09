
import java.util.Random;
import java.util.Scanner;

public class calcRandom {
	public static void main(String[] args) {
		Random randomGenerator =new Random();
		Scanner kb=new Scanner(System.in);
		
		int calcRandom;
		System.out.print("Enter an integer value as the largest possible value: ");
		calcRandom=kb.nextInt();
		
		int randomValue=(int)(calcRandom*Math.random())+1;
				System.out.println(randomValue);
		

	}

}


