//WAP using different operations of string class.
public class StringOperation_36 {
	public static void main(String[]args)
	{
		String name = "Abhay";
		int value = name.length(); ///name.length() for calculate length of string
		System.out.println(value);
		
		String lowerstring = name.toLowerCase(); ///name.toLwerCase() for convert all character in lowercase.
		System.out.println(lowerstring);
		
		String upperstring = name.toUpperCase(); ///name.toUpperCase() for convert all character in uppercase.
		System.out.println(upperstring);
		
		String nontrimmedstring = "         Abhay              ";
		System.out.println(nontrimmedstring); ///Print same with given string with spaces.
		System.out.println(nontrimmedstring.trim());// name.trim() Remove all spaces and print string
	
		System.out.println(name.substring(2));//name.substring(value ie- 2,3 --etc)
		//it will print the string after given value.
		
		System.out.println(name.substring(2,5));//name.substring(value ie- 1,3)
		//it will print the string avoid given value index or leave sting value 
		//ie- "Abhay"
		//(name.substring(2,5))
		//here A-remove, b-remove, h-print,a-print,y-print
		//mean "Abhay" has 5 point ie- A-1, b-2,h-3,a-4,y-5
		//so here 1 and 2 character will leave
		
		
		System.out.println(name.replace('a','z'));//name.replace('a','z') will replace from (a to z)
		System.out.println(name.replace("bh","zk"));//Same here but you can also replace 1 or more character.
		System.out.println(name.replace("A","Hello"));
		System.out.println(name.replace("Hellobhay","Abhay"));
		
		
		System.out.println(name.startsWith("Ab"));//name.startsWith("Ab") it will check that 
		//whether a given string is start with "Ab" than return True or not than False.
		System.out.println(name.startsWith("ab"));//here it will retuen False.
		
		System.out.println(name.endsWith("ay"));//same are given above it check the starting  from the last.
		System.out.println(name.endsWith("dy"));//here it will return false
		
		
		System.out.println(name.charAt(2));//name.charAt(2) it will give you the character from index of string.
		
		System.out.println(name.indexOf("ha"));//name.indexOf("ha") it will give you character from string at index address.
		System.out.println(name.indexOf("y")); // it show where charcter start and give you
		System.out.println(name.indexOf("bhay"));
		System.out.println(name.indexOf("y45d"));//if it is not match from string than it give -1.
		System.out.println(name.indexOf("a",2));// if we give index 2 than it will search after and from index 2.
		System.out.println(name.lastIndexOf("a"));//here it will start at last.
		System.out.println(name.lastIndexOf("a",1));
		
		System.out.println(name.equals("Abhay"));// it will match the sting form "Abhay" and and return "true" and "False".
		System.out.println(name.equalsIgnoreCase("abhay")); //it will ignor upercase or lowercase.
		
		
		
		
		
	}
	

}
