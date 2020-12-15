import java.io.*;
class Employee
{
	private int id;
	private String name;
	private String dept;
	private float sal;
	
	public Employee()
	{
	}
	
	public Employee(int id, String name,String dept,float sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}

	public void accept()
	{
	try
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id\n");
		id=Integer.parseInt(br.readLine());
		System.out.println("Enter Name\n");
		name=(br.readLine());
		System.out.println("Enter Department name\n");
		dept=(br.readLine());
		System.out.println("Enter Salary\n");
		sal=Float.parseFloat(br.readLine());
	}catch(Exception e)
		{}
	}

	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
		System.out.println("DEPARTMENT NAME: "+dept);
		System.out.println("SALARY: "+sal);
	}
	public float getsal()
	{
		return sal;
	}
}

class Manager extends Employee
{
	private float bonus;
	
	public Manager()
	{
		super();
		bonus=0;
	}
	
	public Manager(int id, String name,String dept,float sal,float bonus)
	{
		super(id,name,dept,sal);
		this.bonus=bonus;
	}
	
	public void accept()
	{
	try
	{
		super.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Bonus\n");
		bonus=Float.parseFloat(br.readLine());
	}catch(Exception e)
		{}
	}
	
	public void display()
	{
		super.display();
		System.out.println("BONUS: \n"+bonus);
	}
	
	public static int maxsal(Manager m[])
	{
		float max=0; 
		int pos=0;
		for(int i=0;i<m.length;i++)
		{
			float total=m[i].getsal()+m[i].bonus;
			if(max<total)
			{
				max=total;
				pos=i;
			}
		}
		return pos;		
	}	
}

 class Employee1
{
	public static void main(String args[])
	{
	try
	{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many managers \n");
		n=Integer.parseInt(br.readLine());
		
		Manager m[]=new Manager[n];
		
		for(int i=0;i<n;i++)
		{
			m[i]=new Manager();
			m[i].accept();
		}
		for(int i=0;i<n;i++)
		{
			m[i].display();
		}
		System.out.println("\n\nmanager with max salary\n");
		int max=Manager.maxsal(m);
			m[max].display();
	}catch(Exception e)
		{}
	}
}
	
