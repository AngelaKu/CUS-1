/*
Then create a CatDemo tester class. Create an object c1 as an argument constructor. Set any values you choose.
Call the showInfo() method. Create object c2 as a no argument constructor.  Set the age to 11 and then Call 
the showInfo() method
 */
public class CatDemo {

	public static void main(String[] args) {
		
		Cat c1=new Cat("Snowball",7,12.5);
		c1.showInfo();
		
		System.out.println();
		
		Cat c2=new Cat();
		c2.setAge(11);
		c2.showInfo();
		

	}

}

/*
Name	Snowball
Age	7
Weight	12.5
Jerry is my mouse friend

Name	Tom
Age	11
Weight	15.5
Jerry is my mouse friend
*/