import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Add extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{	
		Cookie c1=new Cookie("Cookie1","1");
		res.addCookie(c1);
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("Cookies added  with value 1");
		
		Cookie c2=new Cookie("Cookie2","2");
		res.addCookie(c1);
		pw.print("Cookies added wityh valie 2");
		pw.close();
	}
}
