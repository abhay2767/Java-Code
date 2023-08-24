//Write a swing program for Grid and Border layout. for Border.

import java.awt.BorderLayout;
import java.applet.*;
import java.awt.*;
class Swing_34 
{
      Frame fr;
   public Swing_34(String str)
  {
    initialize(str);
  }
   public static void main(String []args)
   {
	   Swing_34 b= new Swing_34("borderlayoutexampletitle");
      b.fr.setVisible(true);
   }
   private void initialize(String str)
   {
     fr= new Frame(str);
   Button b1= new Button("North");
   Button b2= new Button("South");
   Button b3= new Button("East");
   Button b4= new Button("West");
   Button b5= new Button("Center");

   fr.setLayout(new BorderLayout(0, 0));
   fr.add(b1, BorderLayout.NORTH);
   fr.add(b2, BorderLayout.SOUTH);
   fr.add(b3, BorderLayout.EAST);
   fr.add(b4, BorderLayout.WEST);
   fr.add(b5, BorderLayout.CENTER);
  
   fr.setSize(200, 200);
  }
}
