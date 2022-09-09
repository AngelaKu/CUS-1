/*
Bird							class
______________________________________________________________
-name:String
-weight:double
_______________________________________________________________
+Bird()
Bird(String, double)
+setName(String):void
+getName():String
+setWeight(double):void
+getWeight():double
+showInfo():void
 */
public class Bird {
	private String name;
	private double weight;
	
	public Bird()
	{
		name="Tweety";
		weight=15.55;
	}
	public Bird(String n, double w)
	{
		name=n;
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
		System.out.println("Weight\t"+weight);
		System.out.println("Have a good summer!");
	}

}
