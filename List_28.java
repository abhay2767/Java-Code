//WAP using:- List.

import java.util.*;
class List_28
{
   public static void main(String []args)
   {
     List<String> l= new ArrayList<String> ();
     l.add("Mango");
     l.add("Apple");
     l.add("Guava");
     l.add("Grapes");
     l.add("Banana");
     for(String fruit:l)
     {
         System.out.println(fruit);
      }
   }
}
