import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;

class regisdemo1 extends JPanel implements ActionListener
{
	JLabel u1,u2,u3,u4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	
	regisdemo1()
	{    FlowLayout fl=new FlowLayout();
		setLayout(fl);
		u1=new JLabel("UNAME");
		add(u1);
		
		t1=new JTextField(10);
		add(t1);
		
		u2=new JLabel("Contact");
		add(u2);
		
		t2=new JTextField(10);
		add(t2);
		
		u3=new JLabel("Email");
		add(u3);
		 
		t3=new JTextField(10);
		add(t3);
		
		u4=new JLabel("UPASS");
		add(u4);
		
		t4=new JTextField(10);
		add(t4);
		
		b1=new JButton("REGISTER");
		add(b1);
		b1.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///abcdb","root","1234");
			Statement st=con.createStatement();
			st.executeUpdate("insert into abctable values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
			con.close();
			JOptionPane.showMessageDialog(null,"user registered");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
			
}
