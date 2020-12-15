
abstract class Shape
{
	public abstract double area();
	public abstract double volume();
}	 
class Sphere extends Shape
{
	double radius;
	Sphere(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return Math.PI*4*radius*radius;
	} 
	public double volume()
	{
		return Math.PI*radius*radius*radius*(4/3);
	}
}

class Cone extends Shape
{	
	double radius;
	double height;
	Cone(double radius,double height)
	{
	        this.height=height;
		this.radius=radius;
	}
	public double area()
	{
		return Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius));
	}
	public double volume()
	{
		return Math.PI*radius*radius*(height/3);
	}
}

class Cylinder extends Shape
{
	double radius;
	double height;
	Cylinder(double radius,double height)
	{
	        this.height=height;
		this.radius=radius;
	}
	public double area()
	{
		return Math.PI*2*radius*height+Math.PI*2*radius*radius;
	}
	public double volume()
	{
		return Math.PI*radius*radius*height;
	}
}

class Box extends Shape
{
	double length;
	double height;
	double breadth;
	Box(double length,double height,double breadth)
	{
		this.length=length;
	        this.height=height;
		this.breadth=breadth;
	}
	public double area()
	{
		return (2*height*breadth)+(2*height*length)+(2*breadth*length);
	}
	public double volume()
	{
		return height*breadth*length;
	}
}

	
public class Shape
{
	public static void main(String[] args)
	{
		Shape s;
		s=new Sphere(3);
		System.out.println("\nArea of sphere= "+s.area());
		System.out.println("Volume of Sphere="+s.volume());
		
	
		s=new Cone(4,5);
		System.out.println("\nArea of Cone= "+s.area());
		System.out.println("Volume of Cone="+s.volume());
		
		s=new Cylinder(3,5);
		System.out.println("\nArea of Cone= "+s.area());
		System.out.println("Volume of Cone="+s.volume());
		
		s=new Box(2,3,5);
		System.out.println("\nArea of Cone= "+s.area());
		System.out.println("Volume of Cone="+s.volume());
	}
}
