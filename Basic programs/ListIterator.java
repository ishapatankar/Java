import java.util.*;
import java.io.*;

class ListIterator
{
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.add("RED");	
		ll.add("BLUE");
		ll.add("YELLOW");
		ll.add("ORANGE");
		
		ListIterator li=ll.listIterator();	
		System.out.println("contents of the list\n");
		while(li.hasNext())
		{
			String s=(String)li.next();
			System.out.println(s);	
		}
		
		ListIterator i=ll.listIterator();
		while(i.hasNext())
		{
			String elt=(String)i.next();
		}
		System.out.println("contents of the list in the reverse order\n");
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		ll.add(2,"PINK");
		ll.add(3,"GREEN");
		System.out.println("list between blue and yellow is");
		System.out.println(ll);
	}
}

