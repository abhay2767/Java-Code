class Man
{
	private int id;
	private String name;
	
	public Man(String myName)//this is constructor
	{
		id = 22612;		// pass argument here.
		name = myName; // pass argument from main class 
	}
	
	public Man(int myId)// constructor overloading just like method overloading
	{
		id = myId;
		name = "Dubey Ji";
	}
	public int getId()
	{
		return id;
		
	}
	public String getName()
	{
		return name;
	}
}
public class Conctructor_Example {
	public static void main(String[]args)
	{
		Man m = new Man("Abhay Dubey"); // constructor name is same as class man so thats by we pass argument here.
		System.out.println("Id is "+m.getId());
		System.out.println("Name is "+m.getName());
		Man m1 = new Man(21689);
		System.out.println(m1.getId());
		System.out.println(m1.getName());
	}

}
