
class Demooverload{
	void test()
	{
		System.out.println("No parameter");
	}
	void test(int a)
	{
		System.out.println("a:-"+a);
	}
	void test(int a, int b)
	{
		System.out.println("a and b:-"+a);
	}
	 double test(double a)
	{
		System.out.println("Double a:-"+a);
		{
			return a*a;
		}
		}
}
	class overload{
		public static void main(String[]args)
		{
			Demooverload ob = new Demooverload();
			ob.test();
			ob.test(10);
			ob.test(10,20);
			double result = ob.test(123.25);
			{
				System.out.println("Result of ob.test(123.25)"+result);
			}
		}
	}
	


