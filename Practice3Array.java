
public class Practice3Array {
	public static void main(String[]args)
	{
		//create an store and store some values in this and calculate Average of that values using for each loop.
		float []val = {10.2f,20.6f,30.8f,40.4f,50.9f};
		float sum=0;
		for(float values:val)
		{
			sum = sum+values;
		}
		System.out.println("The values of Average is:- "+sum/val.length);
		//value.length =5 (total length of value i.e-10.2,20.6,30.8,40.4,50.9)
		//avg = sum/5;
	}

}
