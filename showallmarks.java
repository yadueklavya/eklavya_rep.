import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class showallmarks extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		String s1=request.getParameter("eng");
		String s2=request.getParameter("hin");
		String s3=request.getParameter("math");
		String s4=request.getParameter("san");
		String s5=request.getParameter("chem");
		String s6=request.getParameter("phy");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///sixcol","root","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from sixcol");
			out.println("<table cellpadding='12'border=5>");
			out.println("<tr>");
			out.println("<th>ENGLISH</th>");
			out.println("<th>HINDI></th>");
			out.println("<th>MATHS</th>");
			out.println("<th>SANSKRIT</th>");
			out.println("<th>CHEMISTRY</th>");
			out.println("<th>PHYSICS</th>");
			out.println("</tr>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("<td>"+rs.getString(5)+"</td>");
				out.println("<td>"+rs.getString(6)+"</td>");
				out.println("</tr>");
			}
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}