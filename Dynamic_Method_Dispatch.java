class Phone
{
	public void Wish()
	{
		System.out.println("Good Moring");
	}
	public void Wellcome()
	{
		System.out.println("Hello! Wellcome you from Class Phone");
	}
}
class SmartPhone extends Phone
{
	public void intro()
	{
		System.out.println("How are You");
	}
	@Override
	public void Wellcome()
	{
		System.out.println("Hello! Wellcome you from Class SmartPhone");
	}
}
public class Dynamic_Method_Dispatch {
	public static void main(String[]args)
	{
		        /*This is allowed*/
		
		//Phone p = new Phone();
		//SmartPhone Sp = new SmartPhone();
		//p.Wellcome();
		//sp.Wellcome();
		
		       /*This is also allowed*/
		Phone p = new SmartPhone();
		// here reference is SuperClass(Phone) and Object(P) is subClass(SmartPhone).
		//because SubClass extends SuperClass.
		
			/*This is not allowed*/
		//SmartPhone Sp = new Phone();
		//This will show an error.
		
		p.Wish();
		p.Wellcome(); // This will run Method of Sub Class not the Super Class.
		//p.intro();  // Not Allowed!!!
		
		//So this is Dynamic Method Dispatch 
		//mean " Ye jo Method h wo run time par decide hota h ki konsa method run hona h.
		//because object apka run time par banta h.
		
		
		
	}

}
