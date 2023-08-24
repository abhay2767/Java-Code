//WAP to calculate volume of rectangle using constructor overloading.

import java.util.Scanner;
public class VolumnOf_Rectangle_15 {
	int length;
	int width;
	int height;
	 void rectangle()
	 {
		 System.out.println("This is default constructor\n");
	 }
	  int rectangle(int h,int w,int l)
	  {
		  length = l;
		  width = w;
		  height = h;
		  return l*w*h;
	  }
	  
public static void main(String[]args)
{
	int len,hei,wid;
	Scanner sc = new Scanner(System.in);
	System.out.println("Calculate Volumn of Rectangle:-\n");
	System.out.println("Enter Height of Rectangle");
	hei = sc.nextInt();
	System.out.println("Enter Length of Rectangle");
	len = sc.nextInt();
	System.out.println("Enter Width of Rectangle");
	wid = sc.nextInt();
	VolumnOf_Rectangle_15 rec = new VolumnOf_Rectangle_15();
	System.out.println("This is Default constructor value");
	rec.rectangle();
	System.out.println("This is Parameterized constructor value");
	System.out.println("The Volumn of Rectangle is:- "+rec.rectangle(len,wid,hei));
	
}
}
