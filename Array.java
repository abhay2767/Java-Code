
public class Array {
	public static void main(String[]args)
	{
	//	int [] marks = {100,50,94,58,78};//declaration + Initialization
		int []marks; //declaration.
		marks = new int[5];//Memory allocation(size)
		marks[0] = 100;//Another way to initialization Array)
		marks[1] = 50;
		marks[2] = 94;
		marks[3] = 58;
		marks[4] = 78;
		for(int i= 0; i<5;i++)
		{
			System.out.println("Marks of student at marks[]"+marks[i]);
			
		}
		//display the array in reverse order using for loop
		System.out.println("Printing the array in reverse order");
		for(int i = marks.length-1;i>=0;i--)
		{
			System.out.println("Reverse order of array marks "+marks[i]);
		}
		System.out.println("New way to new array using for each loop");
		for(int element: marks)
		{
			System.out.println(element);
		}
		
		System.out.println("Check length of Marks "+marks.length);//use to check the length of Array.
		String[]name= {"Abhay", "Dubey", "Deepak","Dubey","Rajat","Pandey"};
		for(int i = 0;i<6;i++)
		{
			System.out.println("Name of Student "+name[i]);
		}
		System.out.println("Check length of Name "+name.length);
	}

}
