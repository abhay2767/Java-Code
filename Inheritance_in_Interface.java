
interface baseInterface
{
	void math1();
	void math2();
}
interface derivedInterface extends baseInterface
{
	void math3();
	void math4();
}
class Mathmatics implements derivedInterface
{
	public void math3()
	{
		System.out.println("Addition");
	}
	public void math4()
	{
		System.out.println("Substraction");
	}
	public void math1()
	{
		System.out.println("Multiplecation");
	}
	public void math2()
	{
		System.out.println("Divition");
	}
}
public class Inheritance_in_Interface {
	public static void main(String[]args)
	{
		Mathmatics m = new Mathmatics();
		m.math1();
		m.math2();
		m.math3();
		m.math4();
		
	}

}
