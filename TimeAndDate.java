import java.util.*;

public class TimeAndDate {
	public static void main(String[]args)
	{
		System.out.println("MiliSecond passed form 1970 to now:- "+System.currentTimeMillis());
		System.out.println("Years passed form 1970 to now:- "+System.currentTimeMillis()/1000/3600/24/365);
		///1000/3600/24/365 for calculate year
		//reload it will change per millisSecond
		
		// Is it safe to store the number of milliseconds in a variable of type long?
		System.out.println("Store miliSecond value in Long dataType:- "
		+Long.MAX_VALUE+", This is the bigest number we can store in Long DataType");
		/*
		Yes, it is absolutely safe to store the number of milliseconds in a variable of type long 
		because the maximum value that can be stored in long is 9223372036854775807. 
		You can see that the maximum value of long is huge. Therefore, we do not need to worry 
		about the value of milliseconds. Notice the output of the below code; the value of current time
		in millisecond is 10^6 times smaller than the maximum value of long data type.
		*/
		
		 Date d = new Date();
		 System.out.println("Current Time and Date is:- "+d);
		 
		 System.out.println("Current time in miliSecond is:- "+d.getTime());
		 System.out.println("Current Date is: -"+d.getDate());
		 System.out.println("Current day is from Sunday is:- "+d.getDay());
		 System.out.println("Months is:- "+d.getMonth());
		 System.out.println("Year passed from 1900 is:- "+d.getYear());
		 
		 Date d1= new Date(1621709639111l);
	     System.out.println("The date calculated form miliseconds is : " + d1);
	}

}
