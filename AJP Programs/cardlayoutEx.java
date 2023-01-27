import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cardlayoutEx extends JFrame implements ActionListener
{
	CardLayout card;
	JButton b1,b2,b3;
	Container c;
	
	cardlayoutEx()
	{
	   c=getContentPane();
	   card=new CardLayout(40,30);
	   c.setLayout(card);


	b1=new JButton("Apple");
	b2=new JButton("boy");
	b3=new JButton("cat");


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
	cardlayoutEx c1=new cardlayoutEx();
	c1.setSize(300,300);
	c1.setVisible(true);
	c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

}