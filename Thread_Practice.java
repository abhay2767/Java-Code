class Abhay1 extends Thread
{
	public void run()
	{
		int i = 0;
		for(i=0; i<50; i++)
		{
			System.out.println("Hello!");
			try {
				Thread.sleep(1000, 500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
class Dubey1 extends Thread
{
	public void run()
	{
		int i = 0;
		for(i=0; i<0; i++)
		{
			System.out.println("Good Morning");
		}
	}
}
public class Thread_Practice {
	public static void main(String[]args)
	{
		Abhay1 A = new Abhay1();
		Dubey1 D = new Dubey1();
		//A.setPriority(6);
		//D.setPriority(9);
		System.out.println("Priority of Abhay1 "+A.getPriority());
		System.out.println("Priority of Dubey1 "+D.getPriority());
		System.out.println("Priority of Dubey1 "+D.getState()); //check the state of thread
		//Whether it is started or not after start it will runnable
		
	//	A.start();
		D.start();
		System.out.println("Priority of Dubey1 "+D.getState());
		System.out.println("Priority of Dubey1 "+Thread.currentThread().getState());
		//reference of current thread state.
	}

}
