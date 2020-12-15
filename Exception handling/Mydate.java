import java.io.*;
class Invaliddate extends Exception
{
	public String toString()
	{
		return "Invalid date";
	}
}
class Invalidmonth extends Exception
{
	public String toString()
	{
		return "Invalid month";
	}
}
class Invalidarg extends Exception
{
	public String toString()
	{
		return "Invalid arg";
	}
}

class Mydate
{
	public static void main(String[] arg)
	{
		try
		{
			if(arg.length<3)
				throw new Invalidarg();

			else
			{
				int dd=Integer.parseInt(arg[0]);
				int mm=Integer.parseInt(arg[1]);
				int yy=Integer.parseInt(arg[2]);
				if(mm<1 || mm>12)
					throw new Invalidmonth();

					switch(mm)
					{
						case 1:case 3:case 5:case 7:case 8:case 10:case 12:
							if(dd<1 || dd>31)
								throw new Invaliddate();
							else
								System.out.println("valid date");
								break;
						case 4:case 6:case 9:case 11:
							if(dd<1 || dd>30)
								throw new Invaliddate();
							else
								System.out.println("valid date");
								break;
	
						case 2:if(yy%4==0)
							{
								if(yy%100==0)
								{
									if(yy%400==0 && (dd<=29 && dd>=1))
									{
										System.out.println("valid date ");
									}
									
								}
								else
									System.out.println("valid date");
							}
							else
								throw new Invaliddate();
							
					}
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			} 
	}
}
