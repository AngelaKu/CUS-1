//Lesson 23
/*
Cat							class
______________________________________________________________


-name:String
-age:int
-weight:double
_______________________________________________________________
+Cat()
Cat(String, int, double)
+setName(String):void
+getName():String
+setAge(int):void
+getAge():int
+setWeight(double):void
+getWeight():double
+showInfo():void
 */
public class Cat {
	private String name;
	private int age;
	private double weight;
	
	public Cat()
	{
		name="Tom";
		age=10;
		weight=15.5;
	}
	public Cat(String n,int a, double w)
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
		System.out.println("Jerry is my mouse friend");
	}
	
}
