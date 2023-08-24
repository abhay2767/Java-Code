//WAP to for handling the uncaught exception using finally.

import java.util.*;
public class Uncaught_Exception_25
{
    public static void main(String []args) throws Exception
    {
      System.out.println("Enter two number");
      Scanner sc= new Scanner(System.in);
      int a= sc.nextInt();
      int b= sc.nextInt();
      try
      {
    	  int c= a/b;
    	  System.out.println("a/b =  "+c); 
      }
      catch(Exception e)
      {
    	  System.out.println("Arithmetic Exception - Divide by 0");  
      }
     finally
     {
    	 System.out.println("Finally Bye");  
     }
    }
}
