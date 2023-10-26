import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3;
	boolean c1=false;
	boolean c2=false;
	boolean c3=false;
	Label l;
	FDemo()
	{
		//FlowLayout fl=new FlowLayout();
		setLayout(null);
		Font f=new Font("",Font.BOLD,30);
		setFont(f);
		l=new Label("EKLAVYA THAKUR");
		l.setSize(300,50);
		l.setLocation(200,350);
		add(l);
		b1=new Button("Click!!");
		b1.setSize(100,100);
		b1.setLocation(100,10);
		add(b1);
        b2=new Button("Click!!");
		b2.setSize(100,100);
		b2.setLocation(250,10);
		add(b2);
		b3=new Button("Click!!");
		b3.setSize(100,100);
		b3.setLocation(400,10);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		if(c1)
		{
			g.fillRect(100,150,100,100);
		c1=false;
		}
		if(c2)
		{
			g.fillOval(250,150,100,100);
			c2=false;
		}
		if(c3)
		{
			g.fillArc(400,150,100,100,90,270);
			c3=false;
		}
	}
		
public void actionPerformed(ActionEvent e)
{
	
	if(e.getSource()==b1)
	{
		c1=true;
		repaint();
	}
	if(e.getSource()==b2)
	{
		c2=true;
		repaint();
	}
	if(e.getSource()==b3)
	{
		c3=true;
		repaint();
	}
}	}

class tictac
{
	public static void main(String arg[])
	{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,500);
f.setLocation(100,100);	
//f.setResizable(false);
}

}