import java.io.*; 
class Employee
{
	private int eno;
	private String name;
	private String dept;
	private float sal;

	public Employee()
	{}
	
	public Employee(int eno,String name,String dept,float sal)
	{
		this.eno=eno;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	
	public void accept()
	{
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ID\n");
		eno=Integer.parseInt(br.readLine());
		System.out.println("Enter Name\n");
		name=(br.readLine());
		System.out.println("Enter Dept\n");
		dept=(br.readLine());
		System.out.println("Enter Sal\n");
		sal=Float.parseFloat(br.readLine());
		}
	catch(Exception e)
	{}
	}
	
	public void display()
	{	
		System.out.println("ID=\n" +eno);
		System.out.println("Name=\n" +name);
		System.out.println("Department=\n" +dept);
		System.out.println("Salary=\n" +sal);
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
	public Manager(int eno,String name,String dept,float sal,float bonus)
	{
	  super(eno,name,dept,sal);
	  this.bonus=bonus;
	}

	public void accept()
	{
	try
	{
		super.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter Bonus\n");
		bonus=Float.parseFloat(br.readLine());
	}
	catch(Exception e)
	{}
	}
	public void display()
	{
		super.display();
		System.out.println("Bonus-\n"+bonus);
	}
	public static int max(Manager m[])
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

class Test
{
	public static void main(String args[])
	{
	try
	{
		int i,n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter no. of managers");
		n=Integer.parseInt(br.readLine());
		
		Manager m[]=new Manager[n];
		for(i=0;i<n;i++)
		{
		   m[i]=new Manager();
		   m[i].accept();
		}
		for(i=0;i<n;i++)
		{
		    m[i].display();
		}
		System.out.println("\nThe maximum salary is=\n");
		int max=Manager.max(m);
		m[max].display();
	
	
	}
	catch(Exception e)
	{}
	}
}
	
	
	
