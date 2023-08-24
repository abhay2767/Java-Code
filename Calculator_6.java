//WAP for simple calculator using switch case.
import java.util.Scanner;
public class Calculator_6 {
	static int sum(int a, int b)
	{
		return a+b;
	}
	static int sub(int a, int b)
	{
		return a-b;
	}
	static int mul(int a, int b)
	{
		return a*b;
	}
	static int div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[]args)
	{
		int a,b,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Simple Calcuator");
		System.out.println("");
		System.out.println("Enter '1' for Addition");
		System.out.println("Enter '2' for Substraction");
		System.out.println("Enter '3' for Multiplecation");
		System.out.println("Enter '4' for Divide");
		num= sc.nextInt();
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Secand Number");
		b = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("The Sum is:- "+sum(a,b));
			break;
		case 2:
			System.out.println("The Sub is:- "+sub(a,b));
			break;
		case 3:
			System.out.println("The Mul is:- "+mul(a,b));
			break;	
		case 4:
			System.out.println("The Div is:- "+div(a,b));
			break;
		default:
			System.out.println("Enjoy your life.");
		}
	}

}
