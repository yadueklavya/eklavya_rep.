import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class showall3 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet'href='abc.css'/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id='mymenu'>");
		out.println("<ul>");
        out.println("<li>Home</li>");
        out.println("<li><a href='insert.html'>Insert</a></li>");
        out.println("<li><a href='search.html'>Search</a></li>");
        out.println("<li><a href='update.html'>Update</a></li>");
        out.println("<li><a href='Delete.html'>Delete</a></li>");
        out.println("<li><a href='newshowall.html'>Showall</a></li>");
        out.println("<li><a href='Contact.html'>Contact</a></li>");
        out.println("</ul>");
        out.println("</div>");

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///eklavyadb","root","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from result1");
			out.println("<center>");
			out.println("<table cellpadding='12'border=1>");
			out.println("<tr>");
			out.println("<th>RNO</th>");
			out.println("<th>Name</th>");
			out.println("<th>PHY</th>");
			out.println("<th>Chem</th>");
			out.println("<th>Math</th>");
			out.println("</tr>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("<td>"+rs.getString(5)+"</td>");				
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("</center>");
			out.close();
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