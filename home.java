import javax.swing.*;
class home extends 	JPanel 
{
	JButton b1,b2,b3;
	//JLable u1,u2,u3;
	home(FDemo f)
	{
		b1=new JButton("LOGIN!!!");
		add(b1);
		
		b2=new JButton("REGISTER HERE");
		add(b2);
		
		b3=new JButton("ABOUT");
		add(b3);
		b1.addActionListener(f);
		b2.addActionListener(f);
		b3.addActionListener(f);
	}
}

		
		