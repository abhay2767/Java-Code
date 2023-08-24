//WAP to read the text and count the words and print there.

public class Count_Words_Of_Text_31
{
	public static void main(String[] args)
	{
		String s="Hello Abhay How are you";
		System.out.println("Given String is:- \n"+s);
	//	Scanner sc = new Scanner(System.in);
		//s = sc.toString();
		//System.out.println("Enter the Text to count the words:- ");
		
		int wordLength=s.split("\\s").length;
		System.out.println("The Number of words present in given text " +wordLength);
	}
}