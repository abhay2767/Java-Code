import java.util.Scanner;
public class condition {
	public static void main(String[]args)
	{
		int age = 26;
		boolean cond = (age==18);
	/*	if(cond)//if(age == 18)
		{
			System.out.println("Yes boy you can drive!");
		}
		else {
			System.out.printf("No boy you can not drive!");
		}
	*/
		/*if((age>18) || (age == 18))
		{
			System.out.println("Yes boy you can drive!");
		}
		else {
			System.out.printf("No boy you can not drive!");
		}
	*/
		int age1;
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age1 = sc.nextInt();
		if(age1>56)
		{
			System.out.println("You are Experienced");
		}
		else if(age1>46)
		{
			System.out.println("You are semi-Experienced");
		}
		else if(age>36)
		{
			System.out.println("You are semi-Experienced");
		}
		else
		{
			System.out.println("You are not Experienced");
		}
		
		}
}
