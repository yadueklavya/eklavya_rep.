import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class inserthome extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("urno");
		String s2=request.getParameter("uname");
		String s3=request.getParameter("uphy");
		String s4=request.getParameter("uchem");
		String s5=request.getParameter("umath");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///eklavyadb","root","1234");
			Statement st=con.createStatement();
			st.executeUpdate("insert into result1 values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
			out.println("data inserted into result1");
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}