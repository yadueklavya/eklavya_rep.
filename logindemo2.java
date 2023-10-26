import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class logindemo2 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///ajava77","root","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from login where UNAME='"+s1+"' AND UPASS='"+s2+"'");
if(rs.next())
{
	response.sendRedirect("mymenu.html");
}	
else
{
	out.println("invalid userpass");
}
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