import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
class FDemo extends Frame{
	public void paint (Graphics g)
	{
		g.drawString("--|| I N T R O D U C T I O N ||--",550,135);
		g.drawString (" NAME = EKLAVYA THAKUR ",200,200);
		g.drawString (" GRADUATED FROM MRSC COLLEGE ,INDORE ",200,250);
		g.drawString (" DREAM MNC = MICROSOFT ",200,300);
		g.drawString (" LIKE TO HELP HELPLESS & VOICELESS. ",200,350);
		g.drawRect(150,100,980,550);
		
		
	}
	
}
class demo134
{
public static void main(String []ar)
{
	FDemo f= new FDemo();
	f.setVisible(true);
f.setSize(1280,720);
f.setLocation(150,50);
f.setBackground(Color.blue);
f.setForeground(Color.yellow);
}

}