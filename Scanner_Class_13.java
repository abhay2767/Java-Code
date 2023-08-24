//WAP to print Name by using Scanner class

import java.util.*;  
public class Scanner_Class_13 
{
	public static void main(String args[])
	{  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             
         // in.close();             
     }  
} 