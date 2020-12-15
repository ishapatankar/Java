import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GreetServlet extends HttpServlet
{
	int count=0;
	public void doGet(HttpServletRequest in,HttpServletResponse out) throws ServletException, IOException
	{
		out.setContentType("text/html");
		PrintWriter p=out.getWriter();
		Cookie c[]=in.getCookies();
		String name="";
		if(c!=null)
		{	int i;
			System.out.println("Cookies are present");
			for(i=0;i<c.length;i++)
			{
				name=c[i].getName();
				if(name.equals("count"))
				{
					count=Integer.parseInt(c[i].getValue());
					//p.println("Value extracted from cookie <br> "+count);
					count++;
					//p.println("Value incremented <br>"+count);
					c[i].setValue(String.valueOf(count));
					//p.println("Value set to cookie <br>"+count);
					out.addCookie(c[i]);
					p.println("Welcome back <br>"+count);
					break;
				}
			}
			if(i==c.length)
			{
				Cookie c1 = new Cookie("count","1");
				out.addCookie(c1);
				p.println("Welome for the first time!!!");
			}
		}
		else
		{
			Cookie c1 = new Cookie("count","1");
			out.addCookie(c1);
			p.println("Welome for the first time!!!");
		}
	}
}
