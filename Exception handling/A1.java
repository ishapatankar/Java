import java.util.*;
import java.io.*;

class A1 
{
	public static void main(String args[])throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many numbers\t");
		int n=Integer.parseInt(br.readLine());
		int e=0,s=0;
		
		TreeSet t=new TreeSet();
		
		while(t.size()<n)
		{
			System.out.println("Enter the number\t");
			e=Integer.parseInt(br.readLine());
			t.add(e);
		}
	
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println("Element is"+i.next());
		}

		System.out.println("Enter number to be searched");
		s=Integer.parseInt(br.readLine());
		if(t.contains(s))
		{
			System.out.println("Element found\n");
		}
		else
		{	
			System.out.println("Element not found\n");
		}
	}
}
			
