
public class dought2 {
	int data = 50;
	void change(dought2 op)
	{
		op.data = data+100;
	}
	public static void main(String[]args)
	{
		dought2 op = new dought2();
		System.out.println("Before Change"+op.data);
		op.change(op);
		System.out.println("After change"+op.data);
	}

}
