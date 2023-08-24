class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		int i = 0;
		while(i<100)
		{
			System.out.println("Thank You: "+this.getName());
			i++;
		}
	}
}
public class Thread_Priority {
	public static void main(String[]args)
	{
		MyThread t1 = new MyThread("Abhay");
		MyThread t2 = new MyThread("Dubey");
		MyThread t3 = new MyThread("Sachin");
		MyThread t4 = new MyThread("Deepak(*IMP*)");
		MyThread t5 = new MyThread("Rajat");
		t4.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}
}
