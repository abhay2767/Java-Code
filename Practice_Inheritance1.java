
class Circle
{
	public int radius;
	
	public double area()
	{
		return Math.PI*this.radius*this.radius;
	}
	Circle()
	{
		System.out.println("I am non parameterrized constructor of Circle");
	}
	Circle(int r)
	{
		System.out.println("I am Circle parameterized Constructor "+r);
		this.radius = r;
	}
}

class Cylinder extends Circle
{
	public int height;
	public double volume()
	{
		return Math.PI*this.radius*this.radius*this.height;
	}
	
	Cylinder(int r, int h)
	{
		super(r);
		System.out.println("I am Cylinder parameterrized constructor "+h);
		this.height = h;
	}
	
}
public class Practice_Inheritance1 {
	public static void main(String[]args)
	{
		//Circle cir = new Circle(12);
		Cylinder cyl = new Cylinder(12,4);
		
	}

}
