
public class DoWhileLoop {
	public static void main(String[]args)
	{
		int a = 10;
		do {
			System.out.println(a);
			a++;
		   }while(a<10);//here condition is false hence a = 10; and condition is (a<5) means false
		//so here it will not enter in loop again and exit the loop and print other line of cede outside of loop
		//if a = 0 and condition is (a<10) than it true so this will enter is loop and print value again and again
		//when condition not satisfied(true) output is{10,0,1,2,3,4,5,6,7,8,9}
	System.out.println("So this is the working of do while loop");
	}

}
