import java.io.*;
abstract class Staff{
	private String name,addr;
	public Staff(){
	}
	public Staff (String name,String addr){
	this.name=name;
	this.addr=addr;
	}
	public String toString(){
		
		return "Staff Name="+name+"\nStaff Address="+addr;
	}

}
class PartStaff extends Staff{
	private int nhrs,rate;
	public PartStaff(){
	}
	public PartStaff(String name,String addr,int nhrs,int rate){
		super(name,addr);
		this.nhrs=nhrs;
		this.rate=rate;
	}
	public String toString(){
		String str=super.toString();
		str+="\n no of hrs="+nhrs;
		str+="\n rate per hrs="+rate;
		return str;
		//return "No of hours="+nhrs+"\nRate per hours="+rate;
	}
}
class FullStaff extends Staff{
	private String dept;
	private float salary;
	public FullStaff(){
	}
	public FullStaff(String name,String addr,String dept,float salary){
		super(name,addr);
		this.dept=dept;
		this.salary=salary;
	}
	public String toString(){
		String str=super.toString();
		str+="\n Department="+dept;
		str+="\n Salary of staff="+salary;
		return str;
		//return "Department="+dept+"\nSalary of staff="+salary;
	}
}


class StaffP{
	public static void main(String args[]){
		int i,n,ch,nhrs,rate;
		String name,addr,dept;
		float salary;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try{
		System.out.println("How many Staff:");
		n=Integer.parseInt(br.readLine());
		Staff s[] = new Staff[n];
		for(i=0;i<n;i++){
			
		System.out.println("Enter your choice:");
		System.out.println("1:PartStaff\n2:FullStaff");
		System.out.println("Your choice is:");
		ch=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Name of Staff:");
		name=br.readLine();
		System.out.println("Enter address of staff:");
		addr=br.readLine();
		
		
		if(ch==1){
		System.out.println("Enter no of hours:");
		nhrs=Integer.parseInt(br.readLine());
		System.out.println("Enter rate per hours:");
		rate=Integer.parseInt(br.readLine());
		s[i] = new PartStaff(name,addr,nhrs,rate);		
		}
		else
		if(ch==2){
			System.out.println("Enter department of staff:");
			dept=br.readLine();
			System.out.println("Enter salary of staff:");
			salary=Float.parseFloat(br.readLine());
			s[i] = new FullStaff(name,addr,dept,salary);
			}
		}
	System.out.println("Staff info:");
	for(i=0;i<n;i++){	
		System.out.println(s[i]);
		
		}
	}catch(IOException e){
		System.out.println(e);
		}
}
}



