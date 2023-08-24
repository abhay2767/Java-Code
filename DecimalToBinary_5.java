//WAP to convert a decimal number to binary.
import java.util.Scanner;

public class DecimalToBinary_5 {
	public static void main( String args[] ) {
	      int dec;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the Decimal number");
	      dec = sc.nextInt();
	      
	      String bin = Integer.toBinaryString(dec);
	      System.out.println(bin);
	   }
}
