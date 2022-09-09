
public class OverloadedDemo1 {
	public static void main(String[] args) 
	{
		//create 3 different calls passing any values you want inside an output statement
		System.out.println("The sum of 2 integers is "+calcSum(2,3));
		System.out.println("The sum of doubles is "+calcSum(1.1,4.4));
		System.out.println("The sum of 3 integers is "+calcSum(1,2,4));
	}
	
	
	/**This calcSum will return the sum of 2 integers
	 * @param num1
	 * @param num2
	 * @return sum
	 */
	
	public static int calcSum(int num1, int num2)
	{
		int sum=num1+num2;
		return sum;
	}
	
	/** This calcSum will return the sum of 2 doubles
	 * @param num1
	 * @param num2
	 * @return sum
	 */
	public static double calcSum(double num1, double num2)
	{
		double sum=num1+num2;
		return sum;
	}
	/**
	 * This calcSum will return the sum of 3 integers
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return sum
	 */
	public static int calcSum(int num1, int num2, int num3)
	{
		int sum=num1+num2+num3;
		return sum;
	}
}


