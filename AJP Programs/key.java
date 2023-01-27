import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class key extends Applet implements KeyListener{

    String msg="";

    public void init()
    {
        addKeyListener(this);
    }
    public void keyReleased(KeyEvent k)
    {
        showStatus("key released");
        repaint();
    }
    public void keyPressed(KeyEvent k)
    {
        showStatus("key pressed");
        repaint();
    }
    public void keyTyped(KeyEvent k)
    {
        showStatus("key Typed");
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,10,10)
    }

}