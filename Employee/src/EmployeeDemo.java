//LESSON 21



public class EmployeeDemo {
	public static void main(String[]args)
	{
		//Create one object el from the Employee class
		//output the default Java provided "nothingness values"
		//set the id to 12345
		//output the ID only
		//set the salary to 75555
		//set the vacation days to 10
		//output the id salary and vacation days using the showInfo method
		
		//recall that object creation general syntax
		//className objectNmae = new className( ); ( ) may or may not be empty
		
		Employee el=new Employee();//uses the no argument constructor so the values will be set to what we have in our definition
		el.showInfo();
		
		el.setID(12345);
		System.out.println("The id is now set to be "+el.getID());
		el.setSalary(75555.55);
		el.setVacDays(10);
		el.showInfo();
		//lets use the argument constructor and pass through 56789 as the id 123456.78 as the salary and 21 as vacDays
		Employee e2=new Employee(56789,123456.78,21);
		e2.showInfo();
		
		
		
	}

}

/*
IDer	:0
Salary	65555.55
VacDays	5
The id is now set to be 12345
IDer	:12345
Salary	75555.55
VacDays	10
IDer	:56789
Salary	123456.78
VacDays	21
 */