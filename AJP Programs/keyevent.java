import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class keyevent extends JFrame implements KeyListener 
{
    JLabel l1=new JLabel("idle");
    keyevent()
    {
        Frame f=new Frame("myframe");
        
        TextArea ta=new TextArea(10,20);
        ta.addKeyListener(this);

        f.add(l1);
        f.add(ta);
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());

    }
    public void keyPressed(KeyEvent ke)
    {
        l1.setText("key is pressed");
    }

    public void keyReleased(KeyEvent ke)
    {
        l1.setText("key is released");
    }

    public void keyTyped(KeyEvent ke)
    {
        l1.setText("key is typed");
    }

    public static void main(String [] a)
    {
        keyevent k=new keyevent();
    }

}
