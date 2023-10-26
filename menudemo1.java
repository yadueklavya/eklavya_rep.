import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class menudemo extends JPanel
{
	JLabel u1;
	JTextField t1;
	JButton;
	JTabbedPane tab1;
	regisdemo rg;
	logindemo lg;
	
	menudemo(FDemo f)
	
	{   rg=new regisdemo(this);
	    lg=new logindemo(this);
        tab1=new JTabbedPane();
		
		add(tab1);
		tab1.addTa("regis",rg);
		tab1.addTab("login",lg);
		
		
		
	    setLayout(new FlowLayout());
	
		u1=new JLabel("menu ");
		add(u1);
		
		t1= new JTextField();
		add(t1);
		 
		 b1= new JButton("menudemo");
		 add(b1);
	}
}

