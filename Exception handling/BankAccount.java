import java.io.*;
class InsufficientFundsException extends Exception
{
	public String toString()
	{
		return "Insufficient balance";
	}
}
class SavingAcc
{
	int acc;
	String name;
	float bal;
	
	SavingAcc(int acc,String name,float bal)
	{
		this.acc=acc;
		this.name=name;
		this.bal=bal;
	} 

	
	public void withdraw(float amt) 
	{	
		try
		{
			if(bal>500 && amt<bal)
			{
				bal=bal-amt;
				System.out.println("balance is "+bal);
			}
			else
				 throw new InsufficientFundsException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void deposit(float damt)
	{
		 bal=bal+damt;
		System.out.println("balance is "+bal);
	}

	public void viewbal()
	{
		System.out.println("Balance is:"+bal);
	}
}
 class BankAccount
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter acc.no name and balance");
		int acc=Integer.parseInt(br.readLine());
		String name=br.readLine();
		float bal=Float.parseFloat(br.readLine());
		SavingAcc sa=new SavingAcc(acc,name,bal);
	
		do
		{
			System.out.println("1.withdraw\n2.deposit\n3.view balance\n4.Exit");
			int ch=Integer.parseInt(br.readLine());
	
			if(ch==1)
			{
				System.out.println("Enter amt");
				float amt=Float.parseFloat(br.readLine());
				sa.withdraw(amt);
			}
			
			if(ch==2)
			{
				System.out.println("Enter amt");
				float damt=Float.parseFloat(br.readLine());
				sa.deposit(damt);
			}
		
			if(ch==3)
				sa.viewbal();
							
			if(ch==4)
				System.exit(1);
		
		}
		while(true);
	
	
	}
}

	


