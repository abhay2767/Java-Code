
public class forLooop {
	public static void main(String[]args)
	{
		System.out.println("This is the working of for loop");
		//Even number 
		//2i = Even Number = 0,2,4,6,8,10
		int n = 5;//mean 5 times- 0,2,4,6,8(Even Number)
		for(int i=0;i<n;i++)
		{
			System.out.println("Even Number"+2*i);
		}
		System.out.println("\n");
		//Odd number 
		//2i+1 = Odd Number = 1,3,5,7,9
		int n1 = 5;//mean 5 times- 1,3,5,7,9(Even Number)
		for(int i=0;i<n1;i++)
			{
				System.out.println("Odd Number"+(2*i+1));
			}
		System.out.println("\n");
		//decrement in for loop
		
		for(int i=7;i!=0;i--)
		{
			System.out.println("Reverce order"+i);
		}
		System.out.println("Now Successfully done for loop");
	}
}
