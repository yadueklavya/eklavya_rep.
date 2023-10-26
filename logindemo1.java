import javax.swing.*;
class logindemo extends JPanel 
{
	JLabel u1,u2;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	
	logindemo(FDemo f)
	{
		setLayout(new FlowLayout());
		u1=new JLabel("name");
		add(u1);
		
		t1=new JTextField(10);
		add(t1);
		
		u2=new JLabel("pass");
		add(u2);
		
		 t2=new JTextField();
		 add(t2);
		 
		 b1=new JButton("LOGIN");
		 add(b1);
		 b1.addActionListener(f);
	}
}
