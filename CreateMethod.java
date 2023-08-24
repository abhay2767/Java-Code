import java.util.Scanner;

public class CreateMethod {
	//creating  VOID type method just to print something it does not return anything
	//when we do not want to return anything that time we use Void type in Method Definition.
	static void Wish()
	{
		System.out.println("All the Best, for a Greate carrier");
	}
	
	
	
	 static int logic(int x, int y)//method definition
	{
		int z;
		if(x>y)
		{
			z = x+y;
			System.out.println("X+Y is:- "+z);
		}
		else {
			z = (x+y)*5;
			System.out.println("(X+Y)*5 is:- "+z);
		}
		x = 100; //Inside the method, the value in the main() method will not change.
		return z;
	}
	public static void main(String[]args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a:-");
		a = sc.nextInt();
		System.out.println("Enter Value of b:-");
		b = sc.nextInt();
		Wish();
		//logic(a,b);// 1st way=method call		
		CreateMethod CreateObject = new CreateMethod(); //2nd way=create object than call the method
		c = CreateObject.logic(a, b);
		System.out.println("Result is:- "+c);
		
	}
}
