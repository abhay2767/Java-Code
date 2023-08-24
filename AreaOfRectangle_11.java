//WAP to calculate Area of rectangle using class and object.
import java.util.Scanner;

public class AreaOfRectangle_11 {
	int rectangle(int l, int w)
	{
		int r = l*w;
		return r;
	}
	public static void main(String[]args)
	{
		int a,b,rel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Rectangle:- ");
		a = sc.nextInt();
		System.out.println("Enter width of Rectangle:- ");
		b = sc.nextInt();
		AreaOfRectangle_11 result = new AreaOfRectangle_11();
		rel = result.rectangle(a, b);
		System.out.println("Area of Rectangle is:= "+rel);
	}

}
