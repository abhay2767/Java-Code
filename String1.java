import java.util.Scanner;
public class String1 {
	public static void main(String[]args)
	{
		String  name ="Abhay";
		//String name = "Abhay Dubey";
		System.out.println(name);
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next(); //  next()for 1 word only.
	    System.out.print(st); 
		String st1 = sc.nextLine(); //  nextLine() for all word.
		System.out.println(st1);  
	/*	
		int a = 5;
		float b = 5.586f;
		System.out.printf("Value of A is: %d and Value of B is %f",a,b);
	*/
	}

}
