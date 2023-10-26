import java.io.*;
import javax.servlet.*;
import javax.servlet.htttp.*;
import java.sql.*;
 public class showallshow extends HttpsServlet
 {
	 public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	 {
		 PrintWriter out=response.getWriter();
		 out.println("<html>");
		 out.println("<body>");
		 out.println("<center>");
		 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql:///trust1","root","1234");
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery("select * from login");
			 out.println("<table cellpadding='12'>");
			 out.println("<tr>");
			 out.println("<th>USERNAME</th>");
			 out.println("<th>USERPASS</th>");
			 out.println("<th>USERCONTACT</th>");
			 out.println("</tr>");
			 while(rs.next())
			 {
				 out.println("<tr>");
				 out.println("<td>"+rs.getString(1)+"</td>");
				 out.println("<td>"+rs.getString(2)+"</td>");
				 out.println("<td>"+rs.getString(3)+"</td>");
				 out.println("</tr>");
				 
			 }
		 }
		 catch(Exception e )
		 {
			 out.println(e);
		 }
		 out.println("</table>");
		 out.println("</cenyer>");
		 out.println("</body>");
		 out.println("</html>");
		 out.close();
		 
	 }
 }