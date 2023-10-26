import javax.swing.*;
class regisdemo extends JPanel
{
	JTextField t1,t3;
	JPasswordField t2;
	JButton b1,b2;
	
	regisdemo(FDemo f)
	{
		t1=new JTextField(10);
		add(t1);
		
		t2=new JPasswordField(10);
		add(t2);
		
		t3=new JTextField(10);
		add(t3);
		
		b1=new JButton("Registration");
		add(b1);
		
		b2=new JButton("Back");
		add(b2);
		b2.addActionListener(f);
	}
}
