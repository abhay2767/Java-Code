//WAP to manipulate string in sorted manner.

import java.util.Arrays;
import java.util.Scanner;

class Sort_String_38{
 

    static void sortString(String str)
    {
    	
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print("Sorted String is:- "+String.valueOf(arr));
    }
 

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        s = sc.nextLine(); 
        System.out.println("Original String is:- "+s);
        sortString(s);
    }
}