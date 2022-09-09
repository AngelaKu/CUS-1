
public class BirdDemo {

	public static void main(String[] args) {

		Bird b1=new Bird();
		b1.showInfo();
		
		System.out.println();
		
		Bird b2=new Bird("Donald",25.5);
		b2.setWeight(175.55);
		b2.showInfo();
		

	}

}
/*
Name	Tweety
Weight	15.55
Have a good summer!

Name	Donald
Weight	175.55
Have a good summer!
*/