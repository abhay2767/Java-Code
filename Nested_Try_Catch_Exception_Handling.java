import java.util.Scanner;

public class Nested_Try_Catch_Exception_Handling {
	public static void main(String[]args)
	{
		int []arr = new int [5]; //create array of size 5
		arr[0] = 4;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 9;
		arr[4] = 10;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			
		System.out.println("Enter the value of Array index");
		int ind = sc.nextInt();
		try {
				System.out.println("Wellcome to the world");
				try 
				{
					System.out.println(arr[ind]);
					flag = false;
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Sorry this index does not exist");
					System.out.println("Exception in Level 2");
					System.out.println(e);
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception in Level 1");
				System.out.println(e);
			}
		}
		System.out.println("Thanks for using this program");
	}
}
