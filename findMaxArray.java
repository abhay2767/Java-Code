
public class findMaxArray {
	public static void main(String[]args)
	{
		int []a= {45,84,65,85,29,57};
		int max = 0;
		for(int e:a)
		{
			if(e>max)
			{
				max  = e;
			}
		}
		System.out.println("The value of the maximum value in Array is:- "+max);
		//for get min and max value.
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}

}
