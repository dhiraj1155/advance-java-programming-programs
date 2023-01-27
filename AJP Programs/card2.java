import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class card2 extends JFrame implements ActionListener {
    CardLayout card;
    Button b1,b2;
    Container c;
    card2()
    {
        c=getContentPane();
        card=new CardLayout();
        c.setLayout(card);

        b1=new Button("windows");
        b2=new Button("MacOs");

        b1.addActionListener(this);
        b2.addActionListener(this);

        c.add("a",b1);
        c.add("b",b2);


    }

    public void actionPerformed(ActionEvent ae)
   {
     card.next(c);
   }
    public static void main(String []args)
    {
        card2 obj=new card2();
        obj.setSize(500,500);
        obj.setVisible(true);
    }
}
