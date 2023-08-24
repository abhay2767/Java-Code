//WAP to find smallest and Largest element in array.

public class LargestAndSmallest_7 {
	public static int getSmallest(int[] b, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (b[i] > b[j])   
		                {  
		                    temp = b[i];  
		                    b[i] = b[j];  
		                    b[j] = temp;  
		                }  
		            }  
		        }  
		       return b[0];  
		}  
	public static void main(String[]args)
	
	{
		int []a= {45,84,65,85,29,57};
		System.out.print("Array = ");
		System.out.print("{ ");
		for(int i =0; i<6; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print("}");
		System.out.println("");
		int max = 0;
		for(int e:a)
		{
			if(e>max)
			{
				max  = e;
			}
		}
		System.out.println("The value of the maximum value in Array is:- "+max);
		System.out.println("The value of the maximum value in Array is:- "+getSmallest(a, 6));

	}

}
