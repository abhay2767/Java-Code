//WAP to the details of Student using this keyword.

class Student
{  
	int rollno;  
	String name;  
	float fee;  
	Student(int rollno,String name,float fee)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
    }  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
 
class thisKeyword_12
{
	public static void main(String args[])
	{
		Student s1=new Student(811,"Abhay",5000f);  
		Student s2=new Student(812,"Lokesh",6000f);  
		s1.display();  
		s2.display();  
	}
}  