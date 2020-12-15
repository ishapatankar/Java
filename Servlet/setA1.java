// servlet
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


 public class setA1 extends HttpServlet
 {
   public void service(HttpServletRequest req, HttpServletResponse rs) throws ServletException, IOException 
    {
	    String ip=req.getRemoteAddr();
		rs.setContentType("text/html");
		PrintWriter pw=rs.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<B>Hello, Welcome To Java Servlet's");
		pw.println("<Br><B>Your IP address is " + ip);
		String name=req.getServerName();
		pw.println("<Br><B>Server name is " + name);
		String name1=req.getRemoteHost();
		pw.println("<Br><B>Client name is " + name1);
		int port=req.getServerPort();
		pw.println("<Br><B>Your port number is " + port);
		String name2=this.getServletName();
		pw.println("<Br><B>Currently loaded Servlet is " + name2);
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
	}   	  	   
}
