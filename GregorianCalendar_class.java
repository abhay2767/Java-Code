import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendar_class {
	public static void main(String[]args)
	{
		Calendar c = Calendar.getInstance();
		System.out.println("Day, Month, Time, TimeZone:- "+c.getTime());
		System.out.println("Date:- "+c.get(Calendar.DATE));
		System.out.println("Second:- "+c.get(Calendar.SECOND));
		System.out.println("Normal timing:- "+c.get(Calendar.HOUR));
		System.out.println("Minutes:- "+c.get(Calendar.MINUTE));
		System.out.println("Railway Hour:- "+c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Railway Timing:- "+c.get(Calendar.HOUR_OF_DAY ) +":"+ c.get(Calendar.MINUTE) + ":"+c.get(Calendar.SECOND));
	
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2020));
		System.out.println(cal.isLeapYear(2023));
		
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[1]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
	}

}
