import java.util.HashSet;

public class Hesh_set {
	public static void main(String[]args)
	{
		HashSet<Integer> myHashSet = new HashSet<>(6,8.5f);
		HashSet<Integer> myHashSet1 = new HashSet<>();
		myHashSet.add(6);
		myHashSet.add(8);
		myHashSet.add(3);
		myHashSet.add(5);
		myHashSet.add(9);
		myHashSet.add(9);//// This element will be ignored
		
		System.out.println(myHashSet);
		myHashSet.remove(3);//deletes 3 from the hashset
		System.out.println(myHashSet);
		
		System.out.println(myHashSet.isEmpty());
		System.out.println(myHashSet1.isEmpty());///it is used to check if there is any object in the HashSet or not.
		System.out.println("The size of myHashSet is : " + myHashSet.size());
		
		
		//myHashSet.clear(); //deletes all the elements from the hashset
		 System.out.println(myHashSet);
	}

}
