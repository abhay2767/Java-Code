import java.util.Scanner;
public class swithCase {
	public static void main(String[]args)
	{
		int age;
		System.out.println("Enter age 18,21,61 only");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		switch(age) {
		case 18:
			System.out.println("You are adult");
			break;
		case 21:
			System.out.println("You are man so now find Job");
			break;
		case 61:
			System.out.println("You are now getting old you can can take rest and get retiered");
			break;	
		default:
			System.out.println("Enjoy your life.");
		}
	}

}
