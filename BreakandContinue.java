
public class BreakandContinue {
	public static void main(String[]args)
	{
		//Break statement using loops
		for(int i = 0; i<5; i++)
		{
			System.out.println(i);
			if(i == 3)
			{
				System.out.println("Ending the loop");
				break;//when i == 3 come than this break works
			}
		}
		System.out.println("This is the working of Break statement\n\n");
		
		//Continue statement using loops
		for(int i = 0; i<10; i++)
			{
				if(i == 6)
				{
					System.out.println("This will ignor this place(6) and go forword to 7,8,9");
					continue;//when (i = 6) come than this continue statement ignor this 6 and go forword to 7,8,9
				}
					System.out.println(i);
			}
		System.out.println("This is the working of Continue statement");
	}

}
