import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cardEx extends JFrame implements ActionListener
{
 	CardLayout card;
	Container c;
	JButton b1,b2,b3;
 cardEx()
{
	 c=getContentPane();
	   card=new CardLayout(40,30);
	   c.setLayout(card);

	b1=new JButton("Apple");
	b2=new JButton("Boy");
	b3=new JButton("Cat");

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
	cardEx cr1=new cardEx();
	cr1.setVisible(true);
	cr1.setSize(300,300);
	cr1.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}