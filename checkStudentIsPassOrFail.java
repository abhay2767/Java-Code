import java.util.Scanner;
public class checkStudentIsPassOrFail {
	public static void main(String[]args)
	{
		byte a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of mathmatics");
		a = sc.nextByte();
		System.out.println("Enter marks of phyics");
		b = sc.nextByte();
		System.out.println("Enter marks of chemistry");
		c = sc.nextByte();
		
		float avg = (a+b+c)/3.0f;
		System.out.println("Average is given below");
		System.out.println(avg);
		
		if(avg >= 40 && a>33 && b>33 && c>33)
		{
			System.out.println("Congratulation! You are passed in each subject and promoted to next class");
		}
		else {
			System.out.println("Sorry! You are fail and not promoted to next class");
		}
		
		
	}

}
