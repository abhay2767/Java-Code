//Write a swing program for Grid and Border layout. for Grid.

import java.awt.*;
import javax.swing.*;
public class Swing_1_34
{
    JFrame jf;
    Swing_1_34()
    {
       jf=  new JFrame();
       JButton b1= new JButton("1");
       JButton b2= new JButton("2");
       JButton b3= new JButton("3");
       JButton b4= new JButton("4");
       JButton b5= new JButton("5");
       JButton b6= new JButton("6");
       JButton b7= new JButton("7");
       JButton b8= new JButton("8");
       JButton b9= new JButton("9");

          jf.add(b1);
          jf.add(b2);
          jf.add(b3);
          jf.add(b4);
          jf.add(b5);
          jf.add(b6);
          jf.add(b7);
          jf.add(b8);
          jf.add(b9);
          jf.setLayout(new GridLayout());
          jf.setSize(300, 300);
          jf.setVisible(true);
    }

      public static void main(String[] args)
      {
           new Swing_1_34();
       }
}
