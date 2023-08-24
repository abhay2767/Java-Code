
interface Bicycle // interface 1
{
	//You can create properties in Interface
	//You can not modify the property in Interface as they are final.
	int a = 45;//this is final by default
	final int b = 56;// here we make it final its not compulsory to to write 'final' this is default final.
	
	void appyBreak(int decrement);//declaration of Method in Interface
	void speedUp(int increment);//declaration of Method in Interface
}

interface Light // interface 2
{
	void turnOn();
	void turnOff();
}


//Interface----We can implement multiple interface now here we created two interface or we use more.
//Abstract class-----We can use only 1 abstract class matlab---hm 1 se jyada use nhi kar sakte.
class AvonBicycle implements Bicycle, Light
{
	void horn()
	{
		System.out.println("PPPPPPPPPPPPPPPPP");
	}
	public void appyBreak(int decrement)//always define it in 'Public' access modifier.
	{
		System.out.println("Apply Break "+decrement);
	}
	public void speedUp(int increment)//always define it in 'Public' access modifier.
	{
		System.out.println("Apply SpeedUp "+increment);
	}
	public void turnOn()//always define it in 'Public' access modifier.
	{
		System.out.println("Turn on Light");
	}
	public void turnOff()//always define it in 'Public' access modifier.
	{
		System.out.println("Turn off Light");
	}
}
public class IInterface {
	public static void main(String[]args)
	{
		AvonBicycle Cycle = new AvonBicycle();
		//You can print property of Interface.
		System.out.println("Value of 'a' "+Cycle.a);
		//You can not modify the property in Interface as they are final.
		//		Cycle.a = 405; //show error   because it is final.
		
		Cycle.appyBreak(10);
		Cycle.speedUp(20);
		
		Cycle.horn();
		
		Cycle.turnOn();
		Cycle.turnOff();
	}

}
