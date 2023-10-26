import javax.swing.*;

class logindemo extends JPanel
{
		JTextField t1;
		JPasswordField t2;
		JButton b1,b2;
		
	logindemo(FDemo f)
	{
		t1=new JTextField (10);
		add(t1);
		
		t2=new JPasswordField(10);
		add(t2);
		
		b1=new JButton("login");
		add(b1);
		
		b2=new JButton("Back");
		b2.setLocation(50,150);
		add(b2);
		
		b1.addActionListener(f);
		b2.addActionListener(f);
	}
}
		
	

	