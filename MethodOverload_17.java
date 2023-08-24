//WAP to implement Method Overloading.

public class MethodOverload_17{
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