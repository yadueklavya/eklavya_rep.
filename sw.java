import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener 

{
    
    Button b[] = new Button[9];

    FDemo()
     {

        setLayout(null);

        Font f = new Font("Brush Script MT", Font.BOLD, 30);
        setFont(f);

        int i, j, k = 0;
        int x, y, w, h;
        x = y = w = h = 100;
        for (i = 0; i < 3; i++) 
        {
            for (j = 0; j < 3; j++)
            {

                b[k] = new Button();
                b[k].setSize(w, h);
                b[k].setLocation(x, y);
                add(b[k]);
                b[k].addActionListener(this);
                k++;
                x += 100;
            
            }
            
            x = 100;
            y += 100;
        }
    }

    int c = 1;

    public void actionPerformed(ActionEvent e)
     {
       
        Button b1 = (Button) e.getSource();
        
        if (c % 2 == 0)
        {
            b1.setLabel("0");
            c = 1;
        }
        else 
        {
            b1.setLabel("x");
            c = 2;
        }

        b1.removeActionListener(this);
    }
}

class demo
 {
    public static void main(String ar[]) 
    {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setSize(1280, 720);
        f.setLocation(100, 100);
        f.setBackground(Color.black);
    }
}