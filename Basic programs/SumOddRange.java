public class SumOddRange
{

	public static void main(String args[])	
	{
		sumOdd(1,10);
	}

	public static boolean isOdd(int number)
	{
		
		if(number>0)
		{
			if(number%2!=0)
			{
			   return true;
			}
			else 
			   return false;
		}
		else 
		  return false;
	}

	public static int sumOdd(int start, int end)
	{
		if((start>0) && (end>0))
		{
			for(int i=start;i<=end;i++)
			{
				isOdd(1);
			}
		}
		else 
		  return -1;
	}
}

