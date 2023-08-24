class Aa
{
	int a;
	public int Abhay() {
		return 4;
	}
	public void Method2()
	{
		System.out.println("I am Method2 from Class A");
	}
}
class Bb extends Aa
{
	@Override
	public void Method2()//so this is Override.
	{
		
		System.out.println("I am Method2 from Class B");
	}
	public void Method3()
	{
		System.out.println("I am Method3 from Class B");
	}
}
public class Method_Overriding {
	public static void main(String[]args)
	{
		System.out.println("This is method overriding\n");
		Aa a = new Aa();
		a.Method2();
		
		Bb b = new Bb();
		b.Method2();
		
		
		
		
	}

}
