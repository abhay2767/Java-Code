
//This is abstract class
//We add to write 'abstract' keyword at starting of 'class'.
//Because we declared a 'abstract method' in this class.
//So this whole class known as 'Abstract class'. 
abstract class Parent
 {
	 int a;
	public void Parent(int a)
	{
		//this keyword refers to current instance itself
		this.a = a;
		System.out.println("I m Base1 class constructor");
	}
	public void Hello()
	{
		System.out.println("Hello");
	}
	abstract public void Greet();//declaration of Abstract Method 1
	abstract public void Greet1();//declaration of Abstract Method 2
}

class Child extends Parent
{
	Child()
	{
		//Super keyword refers to parent class.
		super();
	}
	@Override
	//This is implementation of Abstract Class--Method 1
	public void Greet()
	{
		System.out.println("Good Morning");
	}
	@Override
	//This is implementation of Abstract Class--Method 2
	public void Greet1()
	{
		System.out.println("Good Night");
	}
	
	
}
/*
abstract class Child1 extends Parent()
{
	public void Wish()
	{
		System.out.println("Wellcome");
	}
}
*/

public class Abstract_Class {
	public static void main(String[]args)
	{
		/*
		 * 1- We can not create object of Abstract class.
		 * 2- but if we inherit Abstract class in other class and than, implement all abstract method 
		 * 	  of abstract class(Which we inherit) in other class than we can create object of that class. 
		 */
		
		//Parent p = new Parent(); // show Error because we can not create object of abstract class
		
		Child c = new Child();// This is the way to use abstract class and method.
		c.Greet();
		c.Greet1();
		
		c.Hello();
		
		c.Parent(0);
		
	//	Parent p = new Child();
		//p.Greet();
	}

}
