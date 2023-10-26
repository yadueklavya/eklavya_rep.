import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class newshowall extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		String s1=request.getParameter("urno");
		String s2=request.getParameter("un");
		String s3=request.getParameter("uphy");
		String s4=request.getParameter("uchem");
		String s5=request.getParameter("umath");
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///trust1","root","1234");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from login");
		out.println("<center>");
		out.println("<table cellpadding='12'>");
		out.println("<tr>");
		out.println("<td>NAME</td>");
		out.println("<td>PASSWORD</td>");
		out.println("<td>CONTACT</td>");
		out.println("</tr>");
		while(rs.next())
        {
			out.println("<tr>");
			out.println("<td>"+rs.getString(1)+"</td>");
			out.println("<td>"+rs.getString(2)+"</td>");
			out.println("<td>"+rs.getString(3)+"</td>");
			out.println("<td>"+rs.getString(4)+"</td>");
			out.println("<td>"+rs.getString(5)+"</td>");
		out.println("</table>");
		out.println("</center>");
			
		}		
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}