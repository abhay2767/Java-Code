
public class Finnaly_Block {
	public static int greet()
	{
		try {
			int a = 50;
			int b = 10;
			int c = a/b;
			return c;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("Cleaning up resources...\nThis is the end of program");
		}
		return 0;
	}
	
	public static void main(String[]args)
	{
		int k = greet();
		System.out.println("Result is: "+k);
		
		int a = 7;
		int b = 0;
		while(true)
		{
			try {
				System.out.println(a/b);
			}
			catch(Exception e)
			{
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("I am Finally for value of b: "+b);
			}
			b--;
		}
		
	}

}
/*Note:- try block kabhi akela run nhi hota ushke bad hame catch block ya Finally block jarur likhana padega,
  try{
	//Code
  }
  finally{
  	//Code
 }
*/
