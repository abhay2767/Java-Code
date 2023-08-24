class sample
{
	public int x = 5;
	protected int y = 45;
	int z = 6;
	private int a = 78;
	
	public void print()
	{
		System.out.println("Printing in Class using Method\n");
		System.out.println("public int x "+x);
		System.out.println("protected int y "+y);
		System.out.println("(Default) int z "+z);
		System.out.println("private int a "+a);
		System.out.println("");
	}
}
class sample2 extends sample
{
	void Abhay()
	{
		System.out.println("");
		System.out.println("This is sub Class\n");
		System.out.println("public int x "+x);
		System.out.println("protected int y "+y);
		System.out.println("(Default) int z "+z);
		//System.out.println("private int a "+c1.a); // we can not use private property in Package.
	}
	
}
public class Access_Modifier {
	public static void main(String[]args)
	{
		sample c1 = new sample();
		c1.print();
		System.out.println("Printing in Package(just leave Private Access Modifier)\n");
		System.out.println("public int x "+c1.x);
		System.out.println("protected int y "+c1.y);
		System.out.println("(Default) int z "+c1.z);
		//System.out.println("private int a "+c1.a); // we can not use private property in Package.
		
		sample2 c2 = new sample2();
		c2.Abhay();


		
	}

}
