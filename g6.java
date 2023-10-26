import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	
		Button b1,b2,b3;
		FDemo()
		{
			setLayout(new FlowLayout());
			Font f= new Font ("Yu Mincho Demibold",Font.BOLD,30);
			setFont(f);
			b1= new Button ("EKLAVYA");
			add(b1);
			b2=new Button("THAKUR");
			add(b2);
			b3=new Button("JI");
			add(b3);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
            setBackground(Color.red);
			}
            if(e.getSource()==b2)
           {
            setBackground(Color.green);
            }
            if(e.getSource()==b3)
            {
            setBackground(Color.blue);
            }
			
		}
}
	
class demo
{
public static void main(String [] ar)
{
FDemo f= new FDemo();
f.setVisible(true);
f.setSize(400,400);
f.setLocation(200,100);
}
}
	