import java.util.*;
import java.io.*;

class A3
{
	public static void main(String args[])throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Hashtable ht=new Hashtable();
		float percentage;
		String name;
		
		System.out.println("Enter no of students\n");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student Name:\n");
			name=br.readLine();
			System.out.println("Enter Percentage:\n");
			percentage=Float.parseFloat(br.readLine());
			ht.put(name,percentage);
		}
		
		System.out.println("Hashtable="+ht);
		Enumeration k=ht.keys();
		Enumeration v=ht.elements();
		System.out.println("Name");
		
		while(k.hasMoreElements())
		{
			System.out.println(k.nextElement()+"\t"+v.nextElement());
		}
		System.out.println("enter name to be search:\n");
		String sn=br.readLine();
		k=ht.keys();
		v=ht.elements();
		
		int cnt=0;
		while(k.hasMoreElements())
		{
			name=(String)k.nextElement();
			if(sn.equals(name))
			{
				cnt++;
				System.out.println("Percentage="+v.nextElement());
			}
		}
		if(cnt==0)
			System.out.println("Student not found");
		
	}
}
		
