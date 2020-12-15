import java.io.*;
class Vehicle
{
	private String cname;
	private float price;
	
	public Vehicle()
	{}
	public Vehicle(String cname,float price)
	{
		this.cname=cname;
		this.price=price;
	}
	public String toString()
	{
	   return "Company name="+cname+"\n price="+price;
	}
}

class LMV extends Vehicle
{
	private float mileage;
	public LMV()
	{
	  super();
	  mileage=0;
	}
	public LMV(String cname,float price,float mileage)
	{
		super(cname,price);
		this.mileage=mileage;
	}
	public String toString()
	{
	   String str=super.toString();
	   str+="\n mileage="+mileage;
	   return str;
	}
}

class HMV extends Vehicle
{
	private float capacity;
	public HMV()
	{
		super();
		capacity=0;
	}
	public HMV(String cname,float price,float capacity)
	{
		super(cname,capacity);
		this.capacity=capacity;
	}
	public String toString()
	{
	   String str=super.toString();
	   str+="\n capacity="+capacity;
	   return str;
	}
}

class TestA3 
{
	public static void main(String args[])
	{
	    try
	    {
		int n=0;
		int i;
		float p,cp,m;
		String c; 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many vehicles");
		n=Integer.parseInt(br.readLine());
		Vehicle v[]=new Vehicle[n];
		

		for(i=0;i<n;i++)
		{
			System.out.println("Enter company name");
			c=br.readLine();
			System.out.println("Enter price");
			p=Float.parseFloat(br.readLine());
			System.out.println("Enter choice");
			System.out.println("1.LMV\t 2.HMV");
			int ch=Integer.parseInt(br.readLine());
	
			if(ch==1)
			{
			   System.out.println("Enter mileage");
			   m=Float.parseFloat(br.readLine());
			   v[i]=new LMV(c,p,m);
			}
			if(ch==2)
			{
			   System.out.println("Enter capacity");
			   cp=Float.parseFloat(br.readLine());
			   v[i]=new HMV(c,p,cp);
			}
		}
			for(i=0;i<n;i++)
			{
				System.out.println(v[i]);
			}
	}catch(Exception e)
	  {}
	}
}

