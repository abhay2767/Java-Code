import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java_FIle_Handling {
	public static void main(String[]args)
	{
		
		//Code to create new File
		File myfile = new File("Abhay1.txt");
		
		try {
			myfile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Code to write to a File
		try {
			FileWriter filewriter = new FileWriter("Abhay1.txt");
			filewriter.write("This is java course\nOkay now bay.");
			filewriter.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		//Code to read a File
	
		try {
			Scanner sc = new Scanner(myfile);
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		//Code to delete a file
		if(myfile.delete())
		{
			System.out.println("I have deleted file "+myfile.getName());
		}
		else
		{
			System.out.println("Some problem occurred while deleting the file");
		}
		*/
	}

}
