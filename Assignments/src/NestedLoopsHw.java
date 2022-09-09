
public class NestedLoopsHw {

	public static void main(String[] args) {

		for(int i=1;i<=7;i+=2)
		{
			for(int j=1; j<=i;j++) 
				{
					System.out.print("*");
				}
				System.out.println();
		}
		
		System.out.println();
		
		for(int j=7;j>=1;j-=2)
		{
			for(int l=1;l<=j;l++)
				{
					System.out.print("*");
				}
				System.out.println();
		}

	}

}
/*
*
***
*****
*******

*******
*****
***
*
 */
