public class Palindrome
{
	public static void main(String args[])
	{
		
		System.out.println("palindrome is"+isPalindrome(-222));
		
	}

	public static boolean isPalindrome(int number)
	{
		int temp=number;
		int digit,rev=0;
		
		while(temp!=0)
		{
			digit=temp%10;
			rev=rev*10+digit;
			temp=temp/10;
		}
		
		if(number==rev)
		{
			return true;
		}
		else 
		{
			return false;
		}

	}
}
