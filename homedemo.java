import javax.swing.*;

class homedemo extends JPanel
{
	JButton b1,b2,b3;
	
	homedemo(FDemo f)
	{  
        b1=new JButton("login");
		add(b1);
		
		b2=new JButton ("Registration");
		add(b2);
		
		b3=new JButton("About");
		add(b3);
		
		b1.addActionListener(f);
	    b2.addActionListener(f);
	}
}

		