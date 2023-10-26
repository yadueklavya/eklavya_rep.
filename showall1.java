import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class showall1 extends HttpServlet
{
  //public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///trust1","root","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from login");
		
				out.println("<center>");
				out.println("<table cellpadding='12'>");
				out.println("<tr>");
				out.println("<th>user name</th>");
				out.println("<th>user pass</th>");
				out.println("<th>user contact</th>");
				out.println("</tr>");
			
			while(rs.next())
			{out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("</tr>");
			}
				out.println("</table>");
				out.println("</center>");
		
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
	
