class Mileskilometer
{
	public static void main( String args[])
	{
		tomilesperhr(65);
	}
		
	public static long tomilesperhr(double kmperhr)
	{
		if(kmperhr < 0)
		{
		   return -1;
		}			
		
		return Math.round(kmperhr/1.609);
	}
}	
