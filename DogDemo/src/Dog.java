/*
 * Dog						class
____________________________________________________________________

-Dog:String						
-age:int					
-weight:double					
____________________________________________________________________
+Dog()
+Dog(String,int,double)
+setName(String):void				
+getName():String					
+setAge(int):void	
+getAge():int			
+setWeight(double):void				
+getWeight():double				
+showInfo():void	
 */


public class Dog {

	private String name;
	private int age;
	private double weight;
	
	public Dog()
	{
		name="Scooby";
		age=50;
		weight=75.5;
	}
	public Dog(String n,int a, double w)
	{
		name=n;
		age=a;
		weight=w;
	}
	public void setName(String n) 
	{
		name=n; 	

	}
	public String getname()
	{
		return name;
	}
	public void setAge(int a) 
	{
		age=a; 	

	}
	public int getAge()
	{
		return age;
	}
	public void setWeight(double w) 
	{
		weight=w;	

	}
	public double getWeight()
	{
		return weight;
	}
	public void showInfo()
	{
		System.out.println("Name\t"+name);
		System.out.println("Age\t"+age);
		System.out.println("Weight\t"+weight);

	}
	
}
/*
Name	Scooby
Age		50
Weight	75.5
*/