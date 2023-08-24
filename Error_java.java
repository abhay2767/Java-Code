import java.util.Scanner;

class Addition
{
	public int Addition(int x,int y)
	{
		return x-y;
	}
	public int Substractor(int x, char s)
	{
		return x-s;
	}
}
public class Error_java {
	public static void main(String[]args)
	{
		//		Syntax Error	//
		/*
		int a = 5 //No Semicolumn
		a = a+5;
		d = 4;	//Not declare variable dataType.
		int c = a+d;
		System.out.println(c);
		 */
		
		//		Logical Error     //
		// Write a program to print all prime number between 1 to 10.
		//so this is Logical Error
		
		System.out.println(2);
		for(int i = 1; i< 5;i++)
		{
			System.out.println(2*i+1);
		}
		
		
		

		
		//		RunTime Error     //
		
		//so this is RuneTime Error.
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		k = sc.nextInt();
		System.out.println("Integer part of 1000 divided by K is: "+1000/k);
		//enter 0 to get error when you enter 1 to and any other than their is no error.
	}

}
