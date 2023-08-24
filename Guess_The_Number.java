import java.util.Random;
import java.util.Scanner;

class Game
{
	int number;
	int input_Number;
	int no_Of_Guess=0;
	
	public int Get_Num_Of_Guess()
	{
		return no_Of_Guess;
	}
	
	public void Set_Num_Of_Guess(int no_Of_Guess)
	{
		this.no_Of_Guess = no_Of_Guess;
	}
	
	Game()
	{
		Random rand  = new Random();
		this.number = rand.nextInt(100);
	}
	
	void take_User_Input()
	{
		System.out.println("Guess the Number under 100");
		Scanner sc = new Scanner(System.in);
		input_Number = sc.nextInt();
	}
	
	boolean is_Correct_Num()
	{
		no_Of_Guess++;
		
		if(input_Number == number)
		{
			System.out.format("You guessed right number is this %d\nYou guessed it in %d attempts", number,no_Of_Guess);
			return true;
		}
		else if(input_Number < number)
		{
			System.out.println("Too low....");
		}
		else if(input_Number > number)
		{
			System.out.println("Too High...");
		}
		return false;
	}
}
public class Guess_The_Number {
	public static void main(String[]args)
	{
		
		Game g = new Game();
		boolean b = false;
		while(!b)
		{
			g.take_User_Input();
			b = g.is_Correct_Num();
			System.out.println(b);
	    }
	}

}
