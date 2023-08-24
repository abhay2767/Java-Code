//WAP to implement sum of two numbers by Applet.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Applet_SumOfTwoNum_27 extends Applet implements ActionListener

{
      int x, y, z;
      Label l1= new Label("Enter first number");
      TextField   t1= new TextField(10);
      Label l2= new Label("Enter second number");
      TextField t2= new TextField(10);	
      Button b= new Button("Add");
      public void init()
      {
    	  setBackground(Color.yellow);
    	  add(l1);
    	  add(t1);
    	  add(l2);
    	  add(t2);
    	  add(b);
    	  b.addActionListener(this);
      }
     public void paint(Graphics g)
     {
    	 g.drawString("Sum= "+z, 50, 70);
     }
     public void actionPerformed(ActionEvent ae)
     {
    	 x= Integer.parseInt(t1.getText());
    	 y= Integer.parseInt(t2.getText());
    	 z= x+y;
    	 repaint();
     }
}
