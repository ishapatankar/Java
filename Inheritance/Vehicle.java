import java.io.*;
class Vechicle
{
	private String cname;
	private float price;
	
	public Vechicle()
	{
	}
	
	public Vechicle(String cname, float price)
	{
		this.cname=cname;
		this.price=price;
	}
	
	public String toString()
	{
		return "Company name=\t "+cname+ "\n Price=\t "+price;
	}
}

class LightMotorVechicle extends Vechicle
{
	private int mileage;
	
	public LightMotorVechicle()
	{
		super();
		mileage=0;
	}
	
	public LightMotorVechicle(String cname, float price,int mileage)
	{
		super(cname,price);
		this.mileage=mileage;
	}
	
	public String toString()
	{
		String str=super.toString();
		str+="\n mileage=\t"+mileage;
		return str;
	}
}

class HeavyMotorVechicle extends Vechicle
{
	private float capacity;
	
	public HeavyMotorVechicle()
	{
		super();
		capacity=0;
	}
	
	public HeavyMotorVechicle(String cname, float price, float capacity)
	{
		super(cname,price);
		this.capacity=capacity;
	}
	
	public String toString()
	{
		String str=super.toString();
		str+="\n Capacity=\t "+capacity;
		return str;
	}
}

class TestA3
{
	public static void main(String args[])
	{
		try{
			int n=0;
			int i,m;
			float p,cp;
			String c;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("how many vechicles");
			n=Integer.parseInt(br.readLine());
			Vechicle v[]=new Vechicle[n];
			for(i=0;i<n;i++)
			{
				System.out.println("enter company name");
				c=br.readLine();
				System.out.println("enter price");
				p=Float.parseFloat(br.readLine());
				System.out.println("enter choice");
				System.out.println("1: Light Motor Vechicle\t 2: Heavy Motor Vechicle");
				int ch=Integer.parseInt(br.readLine());
				if(ch==1)
				{
					System.out.println("enter mileage");
					m=Integer.parseInt(br.readLine());
					v[i]=new LightMotorVechicle(c,p,m);
				}
				else if(ch==2)
				{
					System.out.println("enter capacity");
					cp=Float.parseFloat(br.readLine());
					v[i]=new HeavyMotorVechicle(c,p,cp);
				}
			}
			for(i=0;i<n;i++)
			{
				System.out.println(v[i]);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

