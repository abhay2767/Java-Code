import java.util.Scanner;
public class CheckwebsiteDomain {
	public static void main(String[]args)
	{
		String website;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter website name");
		website = sc.next();
		if(website.endsWith(".org"))
		{
			System.out.println("This is an Organizational website");
		}
		else if(website.endsWith(".com"))
		{
			System.out.println("This is a Commercial website");
		}
		else if(website.endsWith(".in"))
		{
			System.out.println("This is an Indian website");
		}
		else if(website.endsWith(".ed"))
		{
			System.out.println("This is an Educational website");
		}
		else if(website.endsWith(".gov"))
		{
			System.out.println("This is a Goverment website");
		} 
	}

}
