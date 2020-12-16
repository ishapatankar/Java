public class MinToYears
{
	public static void main(String args[])
	{
		printYearsAndDays(525600);
	}
	public static void printYearsAndDays(long minutes)
	{
		if(minutes<0)
		{	
			System.out.println("Invalid value");
		}	
		else
		{
			long hrs= minutes/60;
			long days=hrs/24;
			long years= days/365;
			long remainingdays= days%365;

			System.out.println(minutes+ "Min=" +years+ "y and" +remainingdays+ "d");
		}
	}
}
