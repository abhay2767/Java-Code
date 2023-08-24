import java.util.*;
import java.lang.reflect.Array;

public class Array_List {
	public static void main(String[]args)
	{
		ArrayList<Integer> l1 = new ArrayList<>();//Integer ka Array List Banana chah rha h
		ArrayList<Integer> l2 = new ArrayList<>(5);
		l2.add(15);
		l2.add(18);
		l2.add(13);
		l2.add(14);
		l2.add(19);
		
		l1.add(6);
		l1.add(7);
		l1.add(5);
		l1.add(8);
		l1.add(7);
		l1.add(0 ,5);
		l1.add(0,1);
		
		l1.addAll(l2);
		
		System.out.println(l1.contains(7));
		System.out.println(l1.indexOf(7));
		System.out.println(l1.lastIndexOf(7));
		//l1.clear(); //This will clear all thing
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.print(l1.get(i));
			System.out.print(",");
			
		}
		
	}

}
