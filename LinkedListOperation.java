import java.util.*;
public class LinkedListOperation extends Thread{
    public static void main(String[] args) {
    	
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5,77); // Inserts 77 at index 5
        
        System.out.println("Insertion in LinkedList at index [5] = 77");
        System.out.println("L1 Linked list : "+ l1);
        System.out.println("");
        
        System.out.println("L1 Linked list before: "+ l1);
        l1.remove(2); //removes element present at 2nd index
        System.out.println("Delete in LinkedList at index [2] =33");
        System.out.println("L1 Linked list after: "  + l1);
        System.out.println("");
        
        System.out.println("Change Element at index [2] from 33 to 10");
        l1.set(2,10); //changes element present at 2nd index (33 changed to 10)
        System.out.println("L1 Linked list after: "  + l1);
        System.out.println("");
        
        System.out.println("Insert the element 100 at the last position");
        l1.addLast(100); //Inserting 100 at the end of L1
        System.out.println("L1 Linked list after inserting element at last index: "  + l1);
        System.out.println("");
        
        System.out.println("Insert the element 8 at the first position");
        l1.addFirst(8); //Inserting 0 at the starting of L1
        System.out.println("L1 Linked list after: "  + l1);
        System.out.println("");
        
        

    }
}

