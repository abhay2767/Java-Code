//WAP to implement Abstract class.
abstract class Bike
{
	abstract void run();  
}  
class AbstractClass_21 extends Bike
{ 
	void run()
	{
		System.out.println("running safely");
	}
	public static void main(String args[])
	{
		Bike obj = new AbstractClass_21();  
		obj.run();  
	}  
}  