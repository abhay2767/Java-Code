import java.io.*;
public class Input_Output_FileHandling
{
	public static void main(String[]args) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("Abhay.txt");
		BufferedOutputStream b1 = new BufferedOutputStream(fout);
		String s = "Abhay Dubey is a good Boy";
		byte b[] = s.getBytes();
		b1.write(b);
		b1.close();
		fout.close();
	}

}
