import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
	
		setTitle("Login Page");//TitledBorder
		setLayout(null);
		Font f= new Font("Brush Script MT",Font.BOLD,30);
		setFont(f);
		
		Label name = new Label("=|| EKLAVYA  THAKUR ||=");
		name.setSize(377,50);
		name.setLocation(111,50);
		add(name);
		
		Label un = new Label("Enter Name ");
		un.setSize(200,50);
		un.setLocation(100,130);
		add(un);
		
		TextField tx1= new TextField(10);
		tx1.setSize(220,50);
		tx1.setLocation(300,130);
		add(tx1); 
		
		Label up= new Label("Enter Pass.");
		up.setSize(200,50);
		up.setLocation(100,200);
		add(up);
		
		TextField tx2= new TextField();
		tx2.setSize(220,50);
		tx2.setLocation(300,200);
		tx2.setEchoChar('*');
		add(tx2);
		
		Button b1 = new Button ("Login");
		b1.setSize(120,50);
		b1.setLocation(240,280);
		add(b1);
		
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		setResizable(false);
	}
		
}
class demo
{
	public static void main(String [] ar)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(600,400);
		f.setLocation(500,100);
		Color c1= new Color(255,254,145);
		f.setBackground(c1);
		f.setForeground(Color.gray);
	}
}
