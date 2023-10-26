import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class menudemo extends JPanel 
{
	JTabbedPane tab1;
	InsertDemo ins;
	SearchDemo src;
	UpdateDemo ud;
	DeleteDemo dd;
	ShowallDemo sd;	
	
	menudemo()
	{
		
	setLayout(new BorderLayout());
		tab1=new JTabbedPane();
		ins=new InsertDemo();
		src=new SearchDemo();
		ud=new UpdateDemo();
		dd=new DeleteDemo();
		sd=new ShowallDemo();
		
		
		tab1.addTab("INSERT", ins);
		tab1.addTab("SEARCH",src);
		tab1.addTab("UPDATE",ud);
		tab1.addTab("DELETE",dd);
		tab1.addTab("SHOW ALL",sd);
	
		add(tab1);
	}
}
	
	

class InsertDemo extends JPanel implements ActionListener
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	
	InsertDemo()
	{
		setLayout(null);
		u1=new JLabel("Enter Roll.No.");
		u1.setBounds(50,50,120,35);
		add(u1);
		
		t1=new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
		u2=new JLabel("Enter Name");
		u2.setBounds(50,100,120,35);
		add(u2);
		
		t2=new JTextField();
		t2.setBounds(180,100,150,30);
		add(t2);
		
		u3=new JLabel("Enter Phy.");
		u3.setBounds(50,150,120,35);
		add(u3);
		
		t3=new JTextField();
		t3.setBounds(180,150,150,30);
		add(t3);
		
		u4=new JLabel("Enter Chem.");
		u4.setBounds(50,200,120,35);
		add(u4);
		
		t4=new JTextField();
		t4.setBounds(180,200,150,30);
		add(t4);
		
		u5=new JLabel("Enter Math.");
		u5.setBounds(50,250,120,35);
		add(u5);
		
		t5=new JTextField();
		t5.setBounds(180,250,150,30);
		add(t5);
		
		b1=new JButton("Insert");
		b1.setBounds(110,320,85,35);
		b1.addActionListener(this);
		add(b1);
		
	   //	b2=new JButton("Back");
	//	b2.setBounds(110,370,85,35);
		//add(b2);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
		String s5=t5.getText();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
        Connection con=DriverManager.getConnection("jdbc:mysql:///eklavyadb","root","1234");

        Statement st=con.createStatement();

        st.executeUpdate("insert into result1 values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");

        JOptionPane.showMessageDialog(null,"Data Insert");
		

        con.close();

        t1.setText("");	
        t2.setText("");	
        t3.setText("");		
        t4.setText("");		
        t5.setText("");	
        }
        catch(Exception e1)
        {
        System.out.println(e1);
        }
		
    }
}
		

class SearchDemo extends JPanel implements ActionListener
{
	JLabel u1;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	SearchDemo()
	{   
		setLayout(null);
		u1=new JLabel("Enter Roll No");
		u1.setBounds(50,50,120,35);
		add(u1);
		
		t1= new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
		t2= new JTextField();
		t2.setBounds(180,120,150,30);
		add(t2);
		
		t3= new JTextField();
		t3.setBounds(180,170,150,30);
		add(t3);
		
		t4= new JTextField();
		t4.setBounds(180,220,150,30);
		add(t4);
		
		t5= new JTextField();
		t5.setBounds(180,270,150,30);
		add(t5);
		
		b1=new JButton("Search");
		b1.setBounds(50,100,80,35);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("update");
		b2.setBounds(50,150,80,35);
		add(b2);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{  
	if(e.getSource()==b1)
	{
		String s1=t1.getText();
		try
		{
		 Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql:///eklavyadb","root","1234");		
		 Statement st=con.createStatement();
		 ResultSet rs=st.executeQuery("Select * from result1 where URNO='"+s1+"'");
		if(rs.next())
		  {
			t2.setText(rs.getString(2));
			t3.setText(rs.getString(3));
			t4.setText(rs.getString(4));
			t5.setText(rs.getString(5));
		  }
		else
		  {
         JOptionPane.showMessageDialog(null,"invalid roll no.");
		 t2.setText(" ");	
		 t3.setText(" ");	
		 t4.setText(" ");	
		 t5.setText(" ");	
	      }
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
	if(e.getSource()==b2)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
		String s5=t5.getText();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///eklavyadb","root","1234");
			Statement st=con.createStatement();
			st.executeUpdate("update result1 set UNAME='"+s2+"',UPHY='"+s3+"',UCHEM='"+s4+"',UMATH='"+s5+"'where URNO='"+s1+"'");
			JOptionPane.showMessageDialog(null,"DATA UPDATE");
			con.close();
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
	
	
	}
}


class UpdateDemo extends JPanel
{
	JLabel u1;
	JTextField t1;
	JButton b1;
	UpdateDemo()
	{  
		setLayout(null);
		u1=new JLabel("UPDATION");
		u1.setBounds(50,50,120,35);
		add(u1);
		
		t1= new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
		b1=new JButton("UpdateDemo");
		b1.setBounds(100,100,80,35);
		add(b1);
	}
}
class DeleteDemo extends JPanel implements ActionListener
{
	JLabel u1;
	JTextField t1;
	JButton b1;
	
	DeleteDemo()
	{    
	   
		setLayout(null);
		u1=new JLabel("ENTER ROLL NO.");
		u1.setBounds(50,50,120,35);
		add(u1);
		
		t1= new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
		b1=new JButton("DATA DELETE");
		b1.setBounds(100,100,80,35);
		add(b1);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///eklavyadb","root","1234");
			Statement st=con.createStatement();
			st.executeUpdate("delete from result1 where URNO='"+s1+"'");
			JOptionPane.showMessageDialog(null,"Data delete");
			con.close();
			t1.setText("");
		
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
	}

}

class ShowallDemo extends JPanel
{
	JLabel u1;
	JTextField t1;
	JButton b1;
	ShowallDemo()
	{  
		setLayout(null);
		u1=new JLabel("Show all");
		u1.setBounds(50,50,120,35);
		add(u1);
		
		t1= new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
		b1=new JButton("Showall Button");
		b1.setBounds(100,100,80,35);
		add(b1);
	}

}
