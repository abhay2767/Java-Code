
class Employe
{
	int id;
	String name;
	int salary;
	public void printDetail()
	{
		System.out.println("My id is "+id);
		System.out.println("My name is "+name);
	}
	public int getSalary()
	{
		return salary;
	}
}
public class CustomClass {
	public static void main(String[]args)
	{
		System.out.println("Hello this is custom class");
		Employe Abhay = new Employe();//creating object of Employee class
		Employe Dube = new Employe();//another object of Employee class
		//setting Attributes.
		Abhay.id = 21689;
		Abhay.name = "Abhay";
		Abhay.salary = 25000;
		 // setting attribute for another object.
		Dube.id = 22612;
		Dube.name = "Dube";
		Dube.salary = 30000;
		
		//printing the attributes.
//		System.out.println("Id is: "+emp.id);
//		System.out.println("Name is: "+emp.name);
		//     OR
		Abhay.printDetail();//call method of employee class.
		int salary =  Abhay.getSalary();
		System.out.println("Salary is "+salary);
		System.out.println("\n");
		Dube.printDetail();//call method of employee class for another object.
		int money = Dube.getSalary();
		System.out.println("Salary is "+money);
	}

}

