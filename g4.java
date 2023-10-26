//event driven program
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	TextField t1,t2,op;
    Button b1,b2,b3,b4;
		
	
    FDemo()
	{
	
	
     setLayout(null);
	 Font f =new Font ("Sitka Display Semibold",Font.BOLD,28);
	 setFont (f);
	
	t1=new TextField(10);
	t1.setSize(200,50);
	t1.setLocation(550,130);
	add(t1);
	
	
	t2=new TextField(10);
	t2.setSize(200,50);
	t2.setLocation(550,210);
	add(t2);
	
	op=new TextField(10);
	op.setSize(200,50);
	op.setLocation(550,400);
	add(op);
	
	
	 Label name = new Label("          =|| EKLAVYA  THAKUR ||=");
     name.setSize(500,50);
	 name.setLocation(250,50);
	 add(name);
	
	Label l1=new Label("  Enter No.1:-");
	l1.setSize(200,50);
	l1.setLocation(250,130);
	add(l1);
	
	
	
	Label l2=new Label("  Enter No.2:-");
	l2.setSize(200,50);
	l2.setLocation(250,210);
	add(l2);
	
	
	b1=new Button ("Add.[+]");
	b1.setSize(110,50);
	b1.setLocation(250,300);
	add(b1);
	
	b2=new Button ("Sub.[-]");
	
	b2.setSize(110,50);
	b2.setLocation(385,300);
	add(b2);
	
	b3=new Button ("Mul.[*]");
	b3.setSize(110,50);
	b3.setLocation(520,300);
	add(b3);
	
	b4=new Button ("Div.[/]");
	b4.setSize(110,50);
	b4.setLocation(650,300);
	add(b4);
	
	Label l3= new Label("  Result      :-");
	l3.setSize(200,50);
	l3.setLocation(250,400);
	add(l3);
	
		
	b1.addActionListener(new ActionListener() 
		{
                 public void actionPerformed(ActionEvent ae)
				 {
                 int x=Integer.parseInt(t1.getText());
                 int y=Integer.parseInt(t2.getText());
                 int z=x+y;
                 op.setText(""+z);
             }
        });
	b2.addActionListener(new ActionListener()
		 {
             public void actionPerformed(ActionEvent ae)
			 {
                 int x=Integer.parseInt(t1.getText());
                 int y=Integer.parseInt(t2.getText());
                 int z=0;
                 if(x>y)
				 {
                 z=x-y;
                 }
                 else if(y>x)
				 {
                     z=y-x;
                 }
                 op.setText(""+z);
             }
        });
	b3.addActionListener(new ActionListener()
		 {
             public void actionPerformed(ActionEvent ae)
			 {
                 int x=Integer.parseInt(t1.getText());
                 int y=Integer.parseInt(t2.getText());
                 int z=x*y;
                 op.setText(""+z);
             }
        });
	b4.addActionListener(new ActionListener() 
		 {
             public void actionPerformed(ActionEvent ae)
			 {
                 int x=Integer.parseInt(t1.getText());
                 int y=Integer.parseInt(t2.getText());
                 int z=0;
                 if(x>y)
				 {
                 z=x/y;
                 }
                 else if(x>y)
				 {
                     z=y/x;
                 }
                op.setText(""+z);
             }
        });   
}
public void actionPerformed(ActionEvent e)
{	
	
	String s1=t1.getText();
	String s2=t2.getText();
	int x=Integer.parseInt(s1);
	int y=Integer.parseInt(s2);
	int z=x+y;
	op.setText(""+z);
 
}
}

class demo 
{
	public  static void main(String ar[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(1280,720);
		f.setLocation(130,10);
		Color c=new Color (168,37,26);
		f.setBackground(c);
		Color c1=new Color(150,33,23);
		f.setForeground(c1);
	}
}

