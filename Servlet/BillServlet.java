import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class BillServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		int bno= Integer.parseInt(req.getParameter("bno"));
	
		ResultSet rs;
		Statement stmt;
		Connection conn;
		String query;
		int no=0;
		float tot=0.0f;
	
		try{
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection("jdbc:postgresql://localhost/ty33","ty33","");
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			query = "select itemname,qty,rate,qty*rate as total,billdate,custname from billmaster,billdetails	where billmaster.billno=billdetails.billno and billmaster.billno="+bno;
	
			rs=stmt.executeQuery(query);
			rs.first();

		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("Bill no:    "+bno);
		out.println("Bill Date:"+rs.getDate(5)+"<br/>");
		out.println("Cust Name:"+rs.getString(6));

		out.println("<table border=2>");
		out.println("<tr>");
		out.println("<th>SrNo.</th>");
		out.println("<th>Item name</th>");
		out.println("<th>Quantity</th>");
		out.println("<th>Rate</th>");
		out.println("<th>Total</th>");
		out.println("</tr>");

		rs.beforeFirst();
		while(rs.next()){
			no++;
			out.println("<tr>");
			out.println("<td>"+no+"</td>");
			out.println("<td>"+rs.getString(1)+"</td>");
			out.println("<td>"+rs.getInt(2)+"</td>");
			out.println("<td>"+rs.getFloat(3)+"</td>");
			out.println("<td>"+rs.getFloat(4)+"</td>");

			tot+=rs.getFloat(4);
		}


		out.println("<tr>");
		out.println("<td colspan=4 align=right>Net Bill</td>");
		out.println("<td>"+tot+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
	catch(Exception e)
	{
		out.println("Not Found");
	}
}
}
		



	
