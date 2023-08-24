
public class sumOfNaturalUsingRecursion {
	static int SumUsingRecursion(int n)
	{
		//sum(n) = 1+2+3...+n
		//sum(n) = 1+2+3...+n-1+n
		//sum(n) = sum(n-1)+n
		//*******Or***********//
		//sum(3) = 3+sum(2)
		//sum(3) = 3+2+sum(1)
		//sum(3) = 3+2+1 = 6
		//sum(3) = 6
		if(n == 1)
		{
			return 1;
		}
		
			return n + SumUsingRecursion(n-1);
		
	}
	public static void main(String[]args)
	{
		int a,b;
		a=3;
		b= SumUsingRecursion(a);
		System.out.println(a);
	}

}
