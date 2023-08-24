class Abhay
{
	int a;
	 
	public int getA()
	{
		return a;
	}
	
	Abhay(int b)
	{
		
		this.a = a;//"this()" this keyword tell the compiler that specific variable or value 
		//suppose above there are two kind of same variable (a and a) so this keyword make the difference b\t them.
		System.out.println("Constructor of Base Class and value is: "+a);
	}
}
class Dube extends Abhay
{
	Dube(int a, int b)
	{
		super(10);
		System.out.println("Constructor of Derived Class "+b);
	}
}
public class this_super {
	public static void  main(String[]args)
	{
		//Abhay ab = new Abhay(5);
		Dube du = new Dube(10,20);
		//System.out.println("Value of 'a' is: "+ ab.a);
		
	}

}
