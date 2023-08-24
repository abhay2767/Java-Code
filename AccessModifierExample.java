
class Employ
{
	//Private access modifier
	private int id;
	private String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	public int getId()
	{
		return id;
	}
	public void setID(int i)
	{
		id = i;
	}
}

public class AccessModifierExample {
	public static void main(String[]args)
	{
		Employ emp = new Employ();
		//emp.id = 56;
		//emp.name = "Abhay";/// Show the Error due to Private access modifier.
		
		emp.setName("Abhay");
		System.out.println("Name is: "+emp.getName());
		emp.setID(22612);
		System.out.println("Id is: "+emp.getId());
		
	}
	
	

}
