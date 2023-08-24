
//import java.util.Scanner;//     import only 'Scanner' 				//1
import java.util.*;//           import all in 'util'					//2

public class Creating_Package_Java 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		//java.util.Scanner sc = new java.util.Scanner(System.in); 		//3
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println("Number is: " +a);
	}
	
}
/*
 * Creating package
 * javac -d . javafile.java           ------compile
 * java packageName.javafile           -----execute
 */
