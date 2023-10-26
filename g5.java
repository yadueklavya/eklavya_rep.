import javax.swing.*;
import java.awt.event.*;
class TTgame extends JFrame
{  
    int k = 0;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b;
	JTextField tf;

	public TTgame(String s)
	{
		super(s);
	}
	public void setComponent()
	{
		b1=new JButton("");
		b1.setBounds(13,13,90,90);
		add(b1);
		
		b2=new JButton("");
		b2.setBounds(110,13,90,90);
		add(b2);
		
		b3= new JButton("");
		b3.setBounds(207,13,90,90);
		add(b3);
		
		b4=new JButton("");
		b4.setBounds(13,110,90,90);
		add(b4);
		
		b5= new JButton("");
		b5.setBounds(110,110,90,90);
		add(b5);
		
		b6=new JButton("");
		b6.setBounds(207,110,90,90);
		add(b6);
		
		b7=new JButton("");
		b7.setBounds(13,207,90,90);
		add(b7);
		
		b8=new JButton("");
		b8.setBounds(110,207,90,90);
		add(b8);
		
		b9=new JButton("");
		b9.setBounds(207,207,90,90);
		add(b9);
		
		b=new JButton("NEW GAME");
		b.setBounds(90,320,130,30);
		add(b);
		
		tf=new JTextField();
		tf.setBounds(20,370,250,30);
		tf.setEditable(false);
		add(tf);
		
		b1.addActionListener(new A1());
		
	}
	class A1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(k==0)
			{b1.setText("X");
		b1.setEnabled(false);
		k=1;
				
			}
			else
			{
				b1.setText("0");
				b1.setEnabled(false);
				k=0;
			
			}
		
		}
	}
	public static void main(String []ar)
	{
		TTgame jf= new TTgame("Tic Tak Toe ");
		jf.setVisible(true);
		jf.setSize(325,450);
		jf.setLocation(100,100);
		jf.setResizable(false);
		jf.setLayout(null);
		jf.setComponent();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
		
			
		
		