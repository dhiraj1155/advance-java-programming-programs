// public 9)Write a program using swing to display a scrollpane and jcombobox in an JApplet with
// items-English ,Marathi,Hindi,Sanskrit.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*<applet class="jcombobox1" height=500 width="500"></applet>*/

public class jcombobox1 extends JApplet implements ItemListener
{
    JLabel l1 ;

    public void init()
    {
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        JComboBox jc = new JComboBox();
    
        jc.addItem("english");
        jc.addItem("hindi");
        jc.addItem("marathi");
        jc.addItem("sanskrit");
        jc.addItemListener(this);

        l1 = new JLabel();
   
        add(jc);
        add(l1);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        String stateName = (String) ie.getItem();

        l1.setText("You are in "+stateName);
    }

}