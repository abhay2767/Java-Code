class Abha extends Thread
{
	public void run()
	{
		int i = 0;
		while(i<100)
		{
			System.out.println("Method running of Abhay1");
			System.out.println("I am happy!");
			i++;
		}
	}
}
class Dubey extends Thread
{
	public void run()
	{
		int i = 0;
		while(i<100)
		{
			System.out.println("Method running of Dubey");
			System.out.println("I am sad!");
			i++;
		}
	}
}
public class Thread_Using_Existing_Class {
	public static void main(String[]args)
	{
		Abha A = new Abha();
		Dubey D = new Dubey();
		
		A.start();
		D.start();
	}

}
