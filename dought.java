
public class dought {
	int data = 50;
	void change(int data)
	{
		data = data + 100;
	}
	public static void main(String[]args)
	{
		dought op = new dought();
		System.out.println("Before change"+op.data);
		op.change(100);
		System.out.println("After change"+op.data);
	}

}
