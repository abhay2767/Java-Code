//in this program i just want to give you a brief knowledge is that given below-
//In case of Array, the reference is paused. same is the case for object passing to method.
public class noteItsImportant {
	static int Sum(int a)
	{
		a = 90;
		return a;
	}
	
	static void Array(int []marks) {
		marks[1] = 90;
	}
	
	public static void main(String[]args)
	{
		int x = 4;
		int y = 5;
		int z;
		z = Sum(x);
	//	noteItsImportant Addition = new noteItsImportant(); ///create object = Addition
	//	z = Addition.Sum(x);
		System.out.println("The value of z is:- "+z);
		
		int []arr = {45,95,75,36,45,68};
		
		for(int i =0;i<6;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		Array(arr);
		System.out.println("");
		System.out.println("updated value at arr[1] is:- "+arr[1]);
		for(int i =0;i<6;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}

}
