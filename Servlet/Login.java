import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet
{	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		try
		{	int count=0;
			String name=req.getParameter("a");
			String password=req.getParameter("p");
			
			Connection conn;
			Statement st;
			ResultSet rs;
			//int flag=0;
			PrintWriter pw=res.getWriter();
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection("jdbc:postgresql://localhost/ty32","ty32","");
			st=conn.createStatement();
			/*rs=st.executeQuery("select *from login");
			while(rs.next())
			{
				if(rs.getString(1).equals(uname)&& rs.getString(2).equals(pass))
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				pw.println("valid login");
			}		
			else
			{
				pw.println("invalid login");
			}
			*/
			String str="select * from login where name='"+name+"'and password='"+password+"'";
			rs=st.executeQuery(str);
			
			if(rs.next())
			{
				pw.println("valid login");
				res.setContentType("text/html");
		
		Cookie c[]=req.getCookies();
		String aname=name;
		if(c!=null)
		{	int i;
			System.out.println("Cookies are present");
			for(i=0;i<c.length;i++)
			{
				name=c[i].getName();
				if(name.equals(name))
				{
					count=Integer.parseInt(c[i].getValue());
					//p.println("Value extracted from cookie <br> "+count);
					count++;
					//p.println("Value incremented <br>"+count);
					c[i].setValue(String.valueOf(count));
					//p.println("Value set to cookie <br>"+count);
					res.addCookie(c[i]);
					pw.println("Welcome back <br>"+count);
					break;https://start.fedoraproject.org/
				}
			}
			if(i==c.length)
			{
				Cookie c1 = new Cookie(name,"1");
				res.addCookie(c1);
				pw.println("Welome for the first time!!!");
			}
		}
		else
		{
			Cookie c1 = new Cookie(name,"1");
			res.addCookie(c1);
			pw.println("Welome for the first time!!!");
		}
			}		
			else
			{
				pw.println("invalid login");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
