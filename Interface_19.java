//WAP to implement interface

interface printable
{
	void print();  
}  
class Interface_19 implements printable
{
	public void print()
	{
		System.out.println("Hello");
	}  
  
public static void main(String args[])
{
	Interface_19 obj = new Interface_19();  
	obj.print();  
}  
}  