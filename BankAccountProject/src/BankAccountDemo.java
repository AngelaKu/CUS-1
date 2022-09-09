
public class BankAccountDemo {

	public static void main(String[] args) 
	{
		//first object b to use the no argument constructor
		//deposit 1000.0
		//display the balance
		//second object b2 to use the argument constructor with an initial balance of 5000.0
		//display the balance
		
		
		BankAccount b1=new BankAccount();
		System.out.println("Original Balance for account 1: $"+b1.getBalance());
		b1.deposit(1000.0);
		System.out.println("The current balance for the account is: $"+b1.getBalance());
		
		System.out.println();
		
		BankAccount b2=new BankAccount(5000.0);
		System.out.println("Original Balance for account 2: $"+b2.getBalance());
		b2.withdrawal(1234.55);
		System.out.println("The current balance for the account is now: $"+b2.getBalance());

	}

}
/*
Original Balance for account 1: $0.0
The current balance for the account is: $1000.0

Original Balance for account 2: $5000.0
The current balance for the account is now: $3765.45
*/
