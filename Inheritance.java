import java.util.Scanner;

class Base//(Base Class, Super Class and Parent Class)
{	
	int a = 5;
	public void setName(String name)
	{
		System.out.println("Hello, Mr."+name+", How are you.");
	}
}
class Derived/*(Derived Class, Sub Class and Child Class)*/ extends Base
{
	public void print()
	{
		System.out.println("Wellcome");
		//System.out.println(a);
	}
	
}

public class Inheritance {
	public static void main(String[]args)
	{
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");
		name = sc.nextLine();
		
		Derived d = new Derived();
		d.print();
		d.setName(name);
		
		
	}
}
