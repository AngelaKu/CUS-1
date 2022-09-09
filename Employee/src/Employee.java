//LESSON 21


/*
 * //className							//class (word only)

Employee						class
____________________________________________________________________

-Id:int						//general syntax
-salary:double					//-variableName:type
-vacDays:int					//-symbol for private access
____________________________________________________________________
+Employee()
+Employee(int,double,int)
+setId(int):void				//methods
+getId():int					//general syntax for mutator or setter method
+setSalary(double):void	//+setNameofVariable(type that would be passed):void + is public
+getSalary():double				//first one variable name is id
+setVacDays(int):void				//+setID(int):void
+getVacDays():int				//general syntax for the accessor or getter method
+showInfo():void				//+getNameofVaiable():returnType
						//for our id variable
						//+getID():int
 */
public class Employee {
	private int id;
	private double salary;
	private int vacDays;
		

	//no argument constructor first to set the values to 0 for id, salary for 65555.55 and vacDays to 5.
	//this means every object you create as a no argument will have for id 0 salary 65555.55 and vacDays as 5.
	public Employee()
	{
		//put the default value for each variable as described\
		id=0;
		salary=65555.55;
		vacDays=5;
	}
	//argument constructor will take values for each variable at the time of the object creation and store those values passed
	//in each data member field as the default values
	//think of in this example the 3 different setter methods combined as one definition
	public Employee(int i,double s, int v)
	{
		id=i;
		salary=s;
		vacDays=v;
	}
	public void setID(int i) 
	{
		id=i; // variableNmae=name in ( )	

	}
	public int getID()
	{
		return id;
	}
	public void setSalary(double s)
	{
		salary=s;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setVacDays(int v)
	{
		vacDays=v;
	}
	public int getVacDays()
	{
		return vacDays;
	}
	public void showInfo()
	{
		System.out.println("ID\t:"+id);
		System.out.println("Salary\t:"+salary);
		System.out.println("VacDays\t:"+vacDays);
	}
}
/*
 * IDer	:0
Salary	65555.55
VacDays	5
 */

