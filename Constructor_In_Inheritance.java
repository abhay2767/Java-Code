
class Base1
{

	Base1()//Creation of Constructor without parameter
	{
		System.out.println("I am a base class constructor");
	}
	Base1(int a)//Overloaded Constructor
	{
		System.out.println("I am a Overloaded Base class constructor with value: "+a);
	}
	
}
class Derived1 extends Base1
{
	
	Derived1()//Creation of Constructor
	{
		//super(0);
		System.out.println("I am a derived class constructor");
	}
	Derived1(int a,int b)//Overloaded COnstructor
	{
		super(a);
		System.out.println("I am a overloaded Derived class constructor with value: "+b);
	}
}
class ChildDerived1 extends Derived1
{
	
	ChildDerived1()//Creation of Constructor
	{
		
		System.out.println("I am a ChildDerived1 class constructor");
	}
	ChildDerived1(int a,int b,int c)//Overloaded COnstructor
	{
		super(a,b);
		System.out.println("I am a overloaded ChildDerived1 class constructor with value: "+c);
	}
}
public class Constructor_In_Inheritance {
	public static void main(String[]args)
	{
		//Derived1 d1 = new Derived1(10);
		//Derived1 d2 = new Derived1(10,20);
		//ChildDerived1 d1 = new ChildDerived1();
		//ChildDerived1 d2 = new ChildDerived1(10,20,30);
		ChildDerived1 d3 = new ChildDerived1();
	}
}