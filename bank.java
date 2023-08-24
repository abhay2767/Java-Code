class Bank1{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank1
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class ICICI extends Bank1
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class AXIS extends Bank1
{
	int getRateOfInterest()
	{
		return 9;
	}
}
class bank{
	public static void main(String[]args)
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI rate of interest"+s.getRateOfInterest());
		System.out.println("ICICI rate of interest"+i.getRateOfInterest());
		System.out.println("AXIS rate of interest"+a.getRateOfInterest());
	}
}
