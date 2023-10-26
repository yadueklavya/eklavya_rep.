import javax.swing.*;
import java.awt.*;
class FDemo extends JFrame
{
	FDemo()
	{
		setLayout(null);
		Font f= new Font("Harlow Solid Italic",Font.BOLD,20);
		JLabel l1= new JLabel(" Name := ");
		l1.setFont(f);
		l1.setSize(300,70);
		l1.setLocation(200,100);
		add(l1);
		
		JTextField tx1=new JTextField(10);
		tx1.setSize(300,40);
		tx1.setLocation(300,120);
		tx1.setFont(f);
		add(tx1);
		
		JLabel l2=new JLabel("Last Name :=");
		l2.setFont(f);
		l2.setSize(300,70);
		l2.setLocation(160,150);
		add(l2);
		
		JTextField tx2=new JTextField(10);
		tx2.setFont(f);
		tx2.setSize(300,40);
		tx2.setLocation(300,165);
		add(tx2);
		
		JLabel l3=new JLabel ("E Mail :=");
		l3.setFont(f);
		l3.setSize(300,40);
		l3.setLocation(200,210);
		add(l3);
		
		JTextField tx3=new JTextField(10);
		tx3.setFont(f);
		tx3.setSize(300,40);
		tx3.setLocation(300,210);
		add(tx3);
		
		JLabel l4=new JLabel ("Contact No.:=");
		l4.setFont(f);
		l4.setSize(300,40);
		l4.setLocation(150,260);
		add(l4);
		
		JTextField tx4=new JTextField(10);
		tx4.setFont(f);
		tx4.setSize(300,40);
		tx4.setLocation(300,255);
		add(tx4);
		
		JLabel l5=new JLabel ("Address:=");
		l5.setFont(f);
		l5.setSize(300,40);
		l5.setLocation(150,300);
		add(l5);
		
		JTextField tx5=new JTextField(10);
		tx5.setFont(f);
		tx5.setSize(300,40);
		tx5.setLocation(300,300);
		add(tx5);
		
		JLabel l6=new JLabel ("DOB:=");
		l6.setFont(f);
		l6.setSize(300,40);
		l6.setLocation(160,350);
		add(l6);
		
		JLabel l7=new JLabel ("Gender :=");
		l7.setFont(f);
		l7.setSize(300,40);
		l7.setLocation(160,400);
		add(l7);
		
		JLabel l8=new JLabel ("Language :=");
		l8.setFont(f);
		l8.setSize(300,40);
		l8.setLocation(160,450);
		add(l8);
		
		JLabel l9=new JLabel ("EKLAVYA THAKUR ");
		l9.setFont(f);
		l9.setSize(300,40);
		l9.setLocation(290,50);
		add(l9);
		
		JTextArea ta1=new JTextArea(300,250);
		ta1.setFont(f);
		add(ta1);
		
		JButton b2=new JButton (" SUBMIT ");
		b2.setFont(f);
		b2.setSize(300,40);
		b2.setLocation(290,530);
		add(b2);
		
		
		
		
				
	}
}
class demo
{
	public static void main(String ar[])
	{
		FDemo f= new FDemo();
		f.setVisible(true);
		f.setSize(1280,720);
		f.setLocation(100,100);
		f.setBackground(Color.gray);
	}
}
