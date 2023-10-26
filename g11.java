//FORM CREAT IN JAVA
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame  implements ActionListener
{
	Button v;
	Label u,b,un,ln,cf,c,a,d,g,l;
	TextField tx1,tx2,tx3,tx4,tx5;
	Choice cb,cb1,cb2;
	Checkbox r1,r2,r3,r4,r5,r6;
	CheckboxGroup bg1,bg2;
	TextArea ta;
FDemo()
{

setLayout(null);
Font f=new Font("",Font.BOLD,20);
setFont(f);
u=new Label("eklavya thakur");
u.setSize(200,30);
u.setLocation(450,500);
add(u); 
b=new Label("FORM");
b.setSize(100,30);
b.setLocation(400,50);
add(b); 
un=new Label("Name");
un.setSize(70,30);
un.setLocation(50,50);
add(un); 
tx1=new TextField(10);
tx1.setSize(200,30);
tx1.setLocation(155,50);
add(tx1);
ln=new Label("Last Name");
ln.setSize(110,30);
ln.setLocation(30,100);
add(ln); 
tx2=new TextField(10);
tx2.setSize(200,30);
tx2.setLocation(155,100);
add(tx2);
cf=new Label("Email");
cf.setSize(70,30);
cf.setLocation(50,150);
add(cf); 
tx5=new TextField(10);
tx5.setFont(f);
tx5.setSize(200,30);
tx5.setLocation(155,150);
add(tx5);
c=new Label("Contact No");
c.setSize(110,30);
c.setLocation(30,200);
add(c); 
tx3=new TextField(10);
tx3.setSize(200,30);
tx3.setLocation(155,200);
add(tx3);
a=new Label("Adress");
a.setSize(90,30);
a.setLocation(40,250);
add(a);
tx4=new TextField(10);
tx4.setSize(200,30);
tx4.setLocation(155,250);
tx4.setFont(f);
add(tx4);
d=new Label("Date");
d.setSize(50,30);
d.setLocation(30,300);
add(d); 
cb=new Choice();
for(int i=1;i<=31;i++)
{
cb.add(""+i);
}
cb.setSize(50,30);
cb.setLocation(155,300);
add(cb);	
cb1=new Choice();
for(int j=1;j<=12;j++)
{
cb1.add(""+j);
}
cb1.setSize(50,30);
cb1.setLocation(205,300);
add(cb1);	
cb2=new Choice();
for(int k=2001;k<=2023;k++)
{
cb2.add(""+k);
cb2.setSize(80,30);
cb2.setLocation(255,300);
}
add(cb2);
g=new Label("Gender");
g.setSize(100,30);
g.setLocation(40,350);
add(g); 
bg1=new CheckboxGroup();		
r1=new Checkbox("Male",true,bg1);
r1.setSize(80,30);
r1.setLocation(150,350);
add(r1);
r2=new Checkbox ("FeMale",false,bg1);
r2.setSize(110,30);
r2.setLocation(250,350);
add(r2);
l=new Label("Language");
l.setSize(110,30);
l.setLocation(30,400);
add(l);
bg2=new CheckboxGroup(); 
r3=new Checkbox ("c",false,bg2);
r3.setSize(80,30);
r3.setLocation(150,400);
add(r3);
r4=new Checkbox ("c++",false,bg2);
r4.setSize(110,30);
r4.setLocation(250,400);
add(r4);
r5=new Checkbox ("java",false,bg2);
r5.setSize(100,30);
r5.setLocation(150,450);
add(r5);
r6=new Checkbox ("python",false,bg2);
r6.setSize(110,30);
r6.setLocation(250,450);
add(r6);
ta=new TextArea(10,5);
ta.setSize(300,300);
ta.setLocation(500,100);
add(ta);
v=new Button("Submit");
v.setSize(100,50);
v.setLocation(250,500);
v.setBackground(Color.blue);
add(v);
v.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{		


}
}	
class demo
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(1100,680);
		f.setLocation(100,50);
	f.setBackground(Color.yellow);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	}