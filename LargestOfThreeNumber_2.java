//WAP to find largest of three number.

import java.util.Scanner;
public class LargestOfThreeNumber_2 {
	public static void main(String[]args)
	{
		int a, b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		a = sc.nextInt();
		System.out.println("Enter Secand Number");
		b = sc.nextInt();
		System.out.println("Enter Third Number");
		c = sc.nextInt();
		
		if (a >= b && a >= b)
		{
			System.out.println("The Largest number is:- "+a);
		}
		else if (b >= a && b >= c)
		{
			System.out.println("The Largest number is:- "+b);
		}
		else {
			System.out.println("The Largest number is:- "+c);
		}
		
		
	}

}
