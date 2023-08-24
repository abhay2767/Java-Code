
import java.util.ArrayDeque;

public class Array_Deque {
	public static void main(String[]args)
	{
		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
		ad1.add(6);
		ad1.add(8);
		ad1.add(9);
		ad1.add(3);
		ad1.add(7);
		ad1.add(2);
		
		ad1.addFirst(5);
		ad1.addLast(5);
		
		ad1.pollFirst(); //deletes 5
       // ad1.removeFirst(); //deletes 56
        
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		
		System.out.println(ad1);
	}

}
