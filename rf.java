import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class FDemo extends JFrame implements ActionListener
{
	CardLayout card;
	
	Container cn=getContentPane();
	
	homedemo hm;
	logindemo lg;
	regisdemo rg;
	menudemo md;
	
	FDemo()
	{
	    setTitle("EKLAVYA REGISTRATION FORM");
		
		card =new CardLayout();
		setLayout(card);
		
		hm=new homedemo(this);
		lg=new logindemo(this);
		rg=new regisdemo(this);
		md=new menudemo();
		
		add("home",hm);
		add("my menu",md);
		add("login",lg);
		add("regis",rg);	
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==hm.b1)
		{
			card.show(cn,"login");
		}
		if(e.getSource()==lg.b2||e.getSource()==rg.b2)
		{
			card.show(cn,"home");
		}
		if(e.getSource()==hm.b2)
		{
			card.show(cn,"regis");
		}
		if(e.getSource()==lg.b1)
		{
			String s1=lg.t1.getText();
			String s2=lg.t2.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql:///eklavyadb","root","1234");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("Select * from insmarks where UNAME='"+s1+"'and'"+s2+"'");
				if(rs.next())
				{
					card.show(cn,"my menu");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid username and password");
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		
	}
}

class demo
{
	public static void main(String ar[])
	{
		FDemo f =new FDemo();
		f.setVisible(true);
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
