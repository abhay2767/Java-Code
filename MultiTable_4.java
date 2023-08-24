//WAP to take a number as input and print its multiplication table unto 10.

import java.util.Scanner;
public class MultiTable_4 {
	static void MultiTable(int a)
	{
		for(int i= 1; i<=10;i++)
		{
			System.out.format("%d X %d = %d",a, i,a*i);
			System.out.println("");
			
		} 
	}
	public static void main(String[]args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to get multiplecation Table:- ");
		x = sc.nextInt();
		MultiTable(x);
	//	multiplecationTable obj1 = new multiplecationTable();
		//y = obj1.MultiTable(x);
	}

}
