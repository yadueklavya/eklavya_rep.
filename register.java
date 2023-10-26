import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class register extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
	
		out.println("<h1>MENU PAGE</h1>");
	
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
