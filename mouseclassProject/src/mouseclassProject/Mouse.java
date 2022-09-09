package mouseclassProject;
/*
Mouse								class
________________________________________________________________
-name:String
-age:int
-weight:double
________________________________________________________________
+mouse()
+mouse(String, int, double)
+setName(String):void
+getName():String
+setAge(int):void
+getAge():int
+setWeight(double):void
+getWeight():double
+showInfo():void

 */
public class Mouse {
	private String name;
	private int age;
	private double weight;
		

	public Mouse()
	{
		name=("House mouse");
		age=12;
		weight=0.68;
	}
	public Mouse(String n,int a, double w)
	{
		name=n;
		age=a;
		weight=w;
	}
	public void setName(String n) 
	{
		name=n; 	

	}
	public String getName()
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
		System.out.println("Name\t:"+name);
		System.out.println("Age\t"+age);
		System.out.println("Weight\t"+weight);
	}
}
