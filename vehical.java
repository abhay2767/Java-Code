 class car
 {
	void run()
	{
		System.out.println("car is running");
	}
}
class vehical extends car
{
	void run()
	{
		System.out.println("Bike is running safely");
	}

public static void main(String []args)
{
	vehical obj = new vehical();
	obj.run();
}
}
