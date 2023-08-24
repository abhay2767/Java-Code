
public class EncrypyAndDecryptOfGrade {
	public static void main(String[]args) {
	char grade = 'B';
	grade = (char)(grade + 8); // data type casting 
	System.out.print("grade is: ");
	System.out.println(grade);
	
	//Decrypt
	grade = (char)(grade-8);
	System.out.print("grade is: ");
	System.out.println(grade);
	}
}
