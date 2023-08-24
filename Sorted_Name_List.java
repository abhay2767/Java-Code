import java.util.*;
public class Sorted_Name_List {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Name you want to sort");
		int num = sc.nextInt();
		String names[] = new String[num];
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Names");
		for(int i = 0; i<num;i++)
		{
			names[i] = sc1.nextLine();	
		}
		for(int i = 0; i<num;i++)
		{
			for(int j = 0; j< i+1; j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println("The sorted names list is");
		for(int i=0; i<num; i++)
		{
			System.out.println(names[i]);
		}
	}

}
