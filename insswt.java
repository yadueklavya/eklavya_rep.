import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class insswt extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		String s3=request.getParameter("uc");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///trust1","root","1234");
			Statement st=con.createStatement();
			st.executeUpdate("insert into login values('"+s1+"','"+s2+"','"+s3+"')");
			out.println("data inserted");
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
