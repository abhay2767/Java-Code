class MyThread1 extends Thread
{
	public MyThread1(String name)
	{
		super(name);
	}
	public void run()
	{
		int i = 34;
		System.out.println("Thank You");
	}
}
public class Thread_Constructor {
	public static void main(String[]args)
	{
		MyThread1 t11 = new MyThread1("Abhay");
		MyThread1 t22 = new MyThread1("Dubey");
		t11.start();
		t22.start();
		System.out.println("The id of the My_Thread mt is: "+t11.getId());
		System.out.println("The Name of the My_Thread mt is: "+t11.getName());
		System.out.println("The id of the My_Thread1 mt1 is: "+t22.getId());
		System.out.println("The Name of the My_Thread1 mt1 is: "+t22.getName());
	}
}
