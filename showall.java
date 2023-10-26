import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class showall extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
	PrintWriter out=response.getWriter();
    out.println("<html>");	
    out.println("<body>");
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///swtdb","root","1234");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from swttable");
	out.println("<center>");
	out.println("<table cellpadding='12'border=1>");
	out.println("<tr>");
	out.println("<th> Name </th>");
	out.println("<th> contact </th>");
	out.println("<th> email </th>");
	out.println("<th> Pass </th>");
	out.println("</tr>");
	while(rs.next())
	{
		out.println("<tr>");
		out.println("<td>"+rs.getString(1)+"</td>");
		out.println("<td>"+rs.getString(2)+"</td>");
		out.println("<td>"+rs.getString(3)+"</td>");
		out.println("<td>"+rs.getString(4)+"</td>");
		out.println("</tr>");
		
	}
	out.println("</table>");
	out.println("</center>");
	con.close();
}	
catch(Exception e)
{
	System.out.println(e);
}
out.println("</body>");
out.println("</html>");
out.close();
	}
}
