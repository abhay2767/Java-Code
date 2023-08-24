
public class Exception_Handling {
	public static void main(String[]args)
	{
		int a = 6000;
		int b = 0;//This is Arithmetic Exception when you divide by '0'
		
		//Without try:-
		//int c = a/b;
		//System.out.println("Result is: "+c);
		
		//With Try:-
		
		try {
			int c1 = a/b;
			System.out.println("Result using try and catch block is: "+c1);
		}
		catch(Exception e){
			System.out.println("We failed to devide the number");
			System.out.println(e);
		}
		
		System.out.println("End of program");
	}

}
