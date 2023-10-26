import java.awt.*;
//import java.awt.Frame;
//import java.awt.Graphics;
//import java.awt.Color;
class FDemo  extends Frame
{
	FDemo()
	{
	setVisible(true);
	setSize(1280,720);
	setLocation(50,50);
	setBackground(Color.gray);
	setForeground(Color.white);
	Font f = new Font ("Comic Sans MS",Font.BOLD,70);
	setFont (f);
	}
public void  paint(Graphics g)
{Color c11=new Color(205,244,253);
g.setColor(c11);
	g.fillRect(20,39,1237,660);
	
	
	Color c9= new Color(135,29,31);
    g.setColor (c9);
	g.drawString("=|| EKLAVYA THAKUR ||= ",585,110);
	Color c10= new Color(219,218,73);
	g.setColor(c10);
	g.drawString("core java",750,180);
	
Color c=new Color(253,126,0);
g.setColor(c);
g.fillRect(100,50,270,70);
Color c1=new Color(255,255,255);//flag
g.setColor(c1);
g.fillRect(100,100,270,70);//flag
Color c2=new Color(0,94,0);
g.setColor(c2);
g.fillRect(100,150,270,50);//flag
g.setColor(Color.blue);
g.drawOval(210,100,50,50);
int n1=235;               
int d1=125;
double n2,d2;
double a= 0.0;    
double l=0.0;
int r=23;
for(int i=1;i<=24;i++)//ashoka chakra
{
a=(double)l*(3.14/180);
n2=n1+(double)r*Math.cos(a);
d2=d1+(double)r*Math.sin(a);
g.drawLine(n1,d1,(int)n2,(int)d2);   
l=l+(360/24);
}
Color c4=new Color(66,0,0);
g.setColor(c4);
g.fillRect(90,40,20,500);//stick

Color c5=new Color(1,1,1);
g.setColor(c5);
g.fillRect(50,500,100,40);//ladder
g.fillRect(30,540,140,40);//ladder

g.drawArc(25,50,160,160,90,180);//rope
g.drawArc(25,210,160,160,270,180);//rope
g.drawLine(100,440,240,440);//hand rop
g.drawArc(65,370,70,70,90,180);//rope

Color c3=new Color(227,226,129);
g.setColor(c3);
g.fillOval(300,330,70,70);//man head
g.fillRect(325,380,20,30);//man nick

Color c7= new Color(120,118,35);
g.setColor(c7);
g.fillRoundRect(295,410,80,80,7,7);//man stomach

Color c8= new Color(84,47,15);
g.setColor(c8);
g.fillRect(305,490,20,75);//leg
g.fillRect(345,490,20,75);//leg

g.fillRect(220,430,75,20);//hand
Color c6= new Color(8,8,8);
g.setColor(c6);
g.fillOval(317,347,10,10);//eys
g.fillOval(344,347,10,10);

g.fillArc(320,375,30,5,180,360);//mouth

g.drawRect(20,39,1237,660);//border

g.fillOval(331,423,7,7);//buttons
g.fillOval(331,443,7,7);
g.fillOval(331,463,7,7);

}

	}
class flag
{
	public static void main(String ar[])
	{
	FDemo f=new FDemo();
	}	
}