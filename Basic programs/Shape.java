import java.io.*;
abstract class shape
{
	public abstract double area();
	public abstract double volume();
}

class Sphere extends shape
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
		return Math.PI*4/3*radius*radius*radius;
	}
}

class Cone extends shape
{
	double radius;
	double height;
	Cone(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
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
	
class Cylinder extends shape
{
	double height;
	double radius;
	Cylinder(double height,double radius)
	{
		this.radius=radius;
		this.height=height;
	}
	public double area()
	{
		return Math.PI*2*radius*height+2*PI*radius*radius;
	}
	public double volume()
	{
		return Math.PI.radius*radius*height;
	}
}
		
public class Test
{
	public static void main(String args[])
	{
	  shape s;
	  s=new Sphere(5.5);
	  System.out.println("Area of sphere=" +s.area());	
	  System.out.println("Vloume of sphere=" +s.volume());
	  
	  s= new Cone(5,2.5);
	  System.out.println("Area of cone=" +s.area());
	  System.out.println("Volume of cone=" +s.volume());
	
	   s= new Cylinder(5,4);
	  System.out.println("Area of Cylinder=" +s.area());
	  System.out.println("Volume of Cylinder=" +s.volume());
	
	}
}












