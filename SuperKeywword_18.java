//WAP to demonstrate the use of 'Super Keyword'.

class Pet
{
	String color="white";  
}  
class SuperKeyword_18 extends Pet
{
	String color="black";  
	void printColor()
	{
		System.out.println(color); 
		System.out.println(super.color);
    }  
}  
class SuperKeywword_18
{ 
	public static void main(String args[])
	{  
		SuperKeyword_18 d=new SuperKeyword_18();  
		d.printColor();  
    }
}