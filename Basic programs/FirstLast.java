public class FirstLast
{
	public static void main(String args[])
	{
		System.out.println("Sum of first and last digit is"+Sumdigit(5));
		
	}

	public static int Sumdigit(int number)
	{
		if(number<0)
		{
			return -1;
		}
		int last,sum;

	//Fiding last number.
		last=number%10;

	//Fiding first number.
		while (number >= 10)  
           	 number /= 10; 
 
       		sum=number+last;
		return sum;
	}
}
		 

