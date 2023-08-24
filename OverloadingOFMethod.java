
public class OverloadingOFMethod {
	static void foo()
	{
		System.out.println("Good Morning");
	}

	static void foo(int a)
	{
		System.out.println("Good Morning "+a+" Bro.");
	}
	public static void main(String[]args)
	{
		int x = 2;
		foo();
		foo(x);
	}
}
//Two or more method can have same name but different parameter.such that method called method overloading.