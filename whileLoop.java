
public class whileLoop {
	public static void main(String[]args)
	{
		int i=1;
		System.out.println("This is While loop");
		
		while(i<=3) //true so this print 1 at one time
			//here i become 2 so (2<=3) true so this print 2 at one time
			//here i become 3 so (3<=3) true so this print 3 at one time
			//here i become 4 so (4<=4) false so this will loop because condition become false so this is While Loop.
		{
			System.out.println(i);//print 1 
			                      //print 2
			                      //print 3
			i++; //here this increase 1 to i+1=1+1=2
			//here i=2 this increase 2 to i+1 = 2+1 = 3
			//here i=3 this increase 3 to i+1 = 3+1 = 4
		}
		System.out.println("Finish running while Loop!");
		/*while(true)
		{
		//	System.out.println("I am an infinite while loop");
		}*/
	}

}
