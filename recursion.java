//WAP to find the factorial of a number.
import java.util.Scanner;
public class recursion {
	static int factorial(int n)
	{
		if(n==0 || n == 1)
		{
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	public static void main(String[]args)
	{
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value to get factorial:- ");
		x = sc.nextInt();
		System.out.println("The value of factorial n is:- "+factorial(x));
	}

}
