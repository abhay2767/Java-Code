//WAP to implement single inheritance

class Employee
{  
	float salary=40000; 
}  
class SingleInheritance_16 extends Employee
{  
	int bonus=10000;  
	public static void main(String args[])
	{
		SingleInheritance_16 p=new SingleInheritance_16();  
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus); 
	}  
}