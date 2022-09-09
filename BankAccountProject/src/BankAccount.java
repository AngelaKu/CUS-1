/*
BankAccount						class
_______________________________________________________
-balance:double
_______________________________________________________
+BankAccount()
+BankAccount(double)
+deposit(double):void
+withdrawal(double):void
+getBalance():double
 */
public class BankAccount {

	private double balance;
	
	public BankAccount()
	{
		balance=0.0;
	}
	public BankAccount(double b)
	{
		balance=b;
	}
	public void deposit(double d)
	{
		balance=balance+d;//will add the value of d to the current balance and store it in balance
	}
	public void withdrawal(double w)
	{
		balance=balance-w;//will subtract the value from the current balance and store it in balance
	}
	public double getBalance()
	{
		return balance;
	}
	
}
