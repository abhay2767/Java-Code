class Abhay11 implements Runnable{
	public void run()
	{
		int i=0;
		while(i<100)
		{
			System.out.println("I am Thread from Abhay");
			System.out.println("I am happy!");
			i++;
		}
	}
}
class Dubey11 implements Runnable{
	public void run()
	{
		int i=0;
		while(i<100)
		{
			System.out.println("I am Thread from Dubey");
			System.out.println("I am sad");
			i++;
		}
	}
}
public class Thread_Using_Runnable_Interface {
	public static void main(String[]args)
	{
		Abhay11 A = new Abhay11();
		Thread a = new Thread(A);
		/*
		 * First we create object of which implement Runnable interface and 
		 * than we have to create a Thread class and object 
		 * now we have to give Runnable to thread
		 * then we run start() using object of Thread class. 
		 */
		
		Dubey11 D = new Dubey11();
		Thread d = new Thread(D);
		
		 a.start();
		 d.start();
	}

}
