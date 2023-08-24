
public class PracticeArray {
	public static void main(String[]args)
	{
		//create a array of 5 floats and calculate their sum
		float []val = {10.2f,20.6f,30.8f,40.4f,50.9f};
		float sum=0;
	//	sum = val[0]+val[1]+val[2]+val[3]+val[4];
	//	System.out.println("Sum of values is:- "+sum);
		
		//***********another way to solve********//using for each loop
		for(float values:val)
		{
			sum = sum+values;
		}
		System.out.println("Sum of values is:- "+sum);
	}
}
