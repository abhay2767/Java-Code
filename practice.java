import java.util.Scanner;
public class practice {
	public static void main(String[]args)
	{
		System.out.println("Enter String to print in lowercase");
		Scanner st = new Scanner(System.in);
	//	String a = sc.next();  // next() to print only one word of the string like= "Abhay is a good boy". So here only "Abhay" print
		String a = st.nextLine(); // nextLine() to print whole string like= "Abhay" is a good boy.
		a  = a.toLowerCase();
		a = a.replace(" ","_"); //a.replace it is for to replace blank space" " with "_".
		
		System.out.println(a);
	}

}
