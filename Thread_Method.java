/*
 * 1-Join() method
 * 2- interrupt method sleep() method
 */
class thread1 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<20)
		{
			System.out.println("Wellcome");
			
			try {
				Thread.sleep(455);//This will stop thread1 for 455-MiliSecond and start running thread2 for
				//455 Milliseconds
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			i++;
		}
	}
}

class thread2 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<20)
		{
			System.out.println("Thank You");
			i++;
		}
	}
}
public class Thread_Method {
	public static void main(String[]args)
	{
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		t1.start();
		
		/* join() method:-

		  try {
		  t1.join();//print thread2 after completion of thread1. 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start(); 
		 */
		
		t2.start();
	}

}
