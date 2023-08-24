import java.util.Scanner;

public class Specific_Exception_handling {
	public static void main(String[]args)
	{
		int []arr = new int [5]; //create array of size 5
		arr[0] = 4;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 9;
		arr[4] = 10;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Array Index");
		int ind = sc.nextInt();
		
		System.out.println("Enter the number you want to divide the value with");
		int number = sc.nextInt();
		try {
			System.out.println("The value of array index entered is: "+arr[ind]);
			System.out.println("The value of array-value/number is: "+arr[ind]/number);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occur");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out OfBounds Exception Occur");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Some other Exception Occur");
			System.out.println(e);
		}
		
		System.out.println("End of Program");
		//when you enter number out of array index[5] than exception occur.
		//when you enter number inside array index but divide it by zero'0' than exception occur.
	}

}
