//WAP in which read a string and reverse its characters.

import java.io.*;
import java.util.Scanner;

class StringReverse_29 {
	public static void main (String[] args) {
		
		String str= "Abhay", nstr="";
		char ch;
		
	System.out.print("Original word: ");
	System.out.println(str);
		
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed word: "+ nstr);
	}
}


