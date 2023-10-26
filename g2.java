import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
//Font f= new Font ("Comic Sans MS",Font.BOLD,30);
	//setFont(f);
	
	}
	public void paint (Graphics g)
	
	{ 
	//Color c1= new Color(213,255,247);
	//g.setColor(c1);
	//g.fillRoundRect(355,135,575,520,10,10);
	
	//g.setColor(Color.red);
	Font g2 = new Font ("Rockwell Nova Extra Bold",Font.BOLD,54);
	g.setFont(g2);
	g.drawString("=|| EKLAVY THAKUR ||=",200,110);   
	int i,j;
	int x= 400;
	int y = 180;
	
	for(i=1;i<=10;i++)
	{
		for(j=1;j<=10;j++)
		{
	Font f= new Font ("Comic Sans MS",Font.BOLD,33);
	       g.setFont(f);
	
			
			//try{Thread.sleep(30);}catch(Exception e){}
			//int r1= (int)Math.round(Math.random()*255);
			//int g1= (int)Math.round(Math.random()*255);
			//int b1= (int)Math.round(Math.random()*255);
			//Color c= new Color (r1,g1,b1);
			//g.setColor(c);
			
			g.drawString(""+i*j,x,y);
			x+=50;
			}
			x=400;
			y+=50;
			
		}
	}
	}
class demo
{
public static void main(String []ar)
{
	FDemo f= new FDemo();
	f.setVisible(true);
f.setSize(1280,720);
f.setLocation(1,50);
//Color c2=new Color(207,207,207);
//f.setBackground(c2);

}

}