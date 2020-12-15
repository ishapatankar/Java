import java.util.*;

class CricketPlayer
{
	String nm;
	int no_of_in,no_of_notout,total_runs;
	float batAvg;

	CricketPlayer(String nm,int total_runs,int no_of_in,int no_of_notout)
	{
		this.nm = nm;
		this.total_runs = total_runs;
		this.no_of_in = no_of_in;
		this.no_of_notout = no_of_notout;
	}

	static void avg(CricketPlayer c[])
	{	
		for(int i=0;i<c.length;i++)
		{
			try
			{
				c[i].batAvg= c[i].total_runs/c[i].no_of_in;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception....."+e);
			}
		}
	}

	static void sort(CricketPlayer c[])
	{
		CricketPlayer temp;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<((c.length-1));j++)
			{
				if(c[j].batAvg>c[j+1].batAvg)
				{
					temp = c[j];
					c[j] = c[j+1];
					c[j+1]= temp;
				}
			}
			
		}
	}

	public String toString()
	{
		return"name:"+nm+"\n no of inning:"+no_of_in+" \n no of not out:"+no_of_notout+" \n total run:"+total_runs+" \n batting avarage:"+batAvg;
	}
}

public class Cricket
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter no. of batsmen:->");
		int n = s1.nextInt();

		CricketPlayer c[] = new CricketPlayer[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Player "+(i+1)+" Data:");
			System.out.println("Enter Name Of Player: ");
			String nm = s1.next();

			System.out.println("Enter no. of innings played: ");
			int no_of_in = s1.nextInt();

			System.out.println("Enter no. of times not out: ");
			int no_of_notout = s1.nextInt();
                   
			System.out.println("Enter Total Runs Scored: ");
			int total_runs = s1.nextInt();
                    
			c[i] = new CricketPlayer(nm,total_runs,no_of_in,no_of_notout);
		}
		
		CricketPlayer.avg(c);
		CricketPlayer.sort(c);
		for(int i=0;i<n;i++)
		{
			System.out.println(""+c[i]);
		}

	}

	
}
