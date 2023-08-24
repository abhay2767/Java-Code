
public class logicalOperator {
	public static void main(String[]args)
	{
		System.out.println("For Logical AND");
		boolean a1 = true;
		boolean b1 = false;
		boolean c1 = true;
		if(a1 && b1 && c1)
		{
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
		
		System.out.println("For Logical OR");
		boolean a2 = true;
		boolean b2 = false;
		boolean c2 = true;
		if(a2 || b2 || c2)
		{
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
		
		System.out.println("For Logical NOT");
		boolean a3 = true;
		boolean b3 = false;
		boolean c3 = true;
		if(a3 != b3) 
		{
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
	}

}
