
public class Practice2Array {
	public static void main(String[]args)
	{
		//create an array and store some valus and check the given values is presented in Array or not.
		float []values = {45.5f,64.8f,63.4f,99.2f,100.8f};
		float num = 99.25f;
		boolean IsInArray = false; //we give this false by default mean we assume that Num is not present in Array.
		//now IsInArray have to proof that 
		//if Num is present in Array.
		for(float element:values)
		{
			if(num == element)
			{
				IsInArray = true;
				break;
			}
		}
		if(IsInArray)
		{
			System.out.println("Value is Present in Array");
		}
		else {
			System.out.println("Value is not Present in Array");
		}
	}

}
