//WAP using:- HashSet.

import java.util.*;
class HashSet_28
{
   public static void main(String []args)
   {
     HashSet<String> h= new HashSet<String>();
     h.add("Mango");
     h.add("Apple");
     h.add("Guava");
     h.add("Grapes");
     h.add("Banana");
     Iterator<String> i= h.iterator();
     while(i.hasNext())
     {
         System.out.println(i.next());
      }
   }
}
