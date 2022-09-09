/*
 * Create object d1 to be the no argument constructor values and show the info and then one d2 where you put any 3 values in
for the argument constructor and show the values.
Set the age to 51
Display an output message that says. The dog had a birthday. the age is now 51 using the getAge method

 */
public class DogDemo {

	public static void main(String[] args) {
		
		Dog d1=new Dog();
		d1.showInfo();
		
		Dog d2=new Dog("Floof",12,8.82);
		d2.showInfo();
		
		Dog d3=new Dog();
		d3.setAge(51);
		System.out.println("The dog had a birthday. The age is now "+d3.getAge());

		

	}

}
/*
Name	Scooby
Age		50
Weight	75.5
Name	Floof
Age	12
Weight	8.82
The dog had a birthday. The age is now 51
*/