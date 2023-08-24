import java.util.Scanner;
public class practice1 {
	public static void main(String[]args)
	{
		System.out.println("Enter String");
		Scanner st = new Scanner(System.in);
		String b = st.nextLine();
		b = b.replace("Abhay","Dubey");
		System.out.println(b);
		System.out.println(b.indexOf("  "));//it will tell the index number where you given 2 blank space and for 1 space it will give -1.
		
		
	}

}
