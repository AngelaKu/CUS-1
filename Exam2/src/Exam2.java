public class Exam2 {
public static void main(String[] args) {
		   
	System.out.println("The average of test1, test2, and test3 is: "+showAverage(80,100.1,90.05));
	System.out.println("The highest max of test1, test2, and test3 is: "+showMax(80,100.1,90.05));
	System.out.println("The lowest min of test1, test2, and test3 is: "+showMin(80,100.1,90.05));
			
	   }
		public static double showAverage(int test1, double test2, double test3) 
		{
			double average = (test1+test2+test3)/3;
			return average;
			
		}
		
		public static double showMax(int test1, double test2, double test3) 
		{
			
			
			double max;
			if (test1>test2)
			{
				if(test1>test3)
					max=test1;
				else
					max=test3;
			}
			else
			{
				if(test2>test3)
					max=test2;
				else
					max=test3;
			}
			return max;
			
		}
		public static double showMin(int test1, double test2, double test3) 
		{
			
			
			double min;
			if (test1<test2)
			{
				if(test1<test3)
					min=test1;
				else
					min=test3;
			}
			else
			{
				if(test2<test3)
					min=test2;
				else
					min=test3;
			}
			
			return min;
		}
		
	   
}
/*
 The average of test1, test2, and test3 is: 90.05
The highest max of test1, test2, and test3 is: 100.1
The lowest min of test1, test2, and test3 is: 80.0
 */