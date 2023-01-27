import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class card1 extends JFrame implements ActionListener
{
    CardLayout card;
    Container c;
    Button b1,b2,b3;
    card1()
    {
        c=getContentPane();
        card=new CardLayout();
        c.setLayout(card);

        b1=new Button("apple");
        b2=new Button("boy");
        b3=new Button("cat");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);

      


    }
    public void actionPerformed(ActionEvent ae)
    {
        card.next(c);
    }
    public static void main(String args[])
    {
        card1 obj=new card1();
        obj.setVisible(true);
        obj.setSize(500,500);
    }
}