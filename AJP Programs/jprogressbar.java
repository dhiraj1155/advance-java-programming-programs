import java.awt.*;
import javax.swing.*;

public class jprogressbar
{
    jprogressbar()
    {
        Frame f=new Frame("frame");
        JProgressBar jb=new JProgressBar(10,100);
        jb.setValue(50);
        jb.setString("progress");
        jb.setBorderPainted(true);
        f.add(jb);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }
    public static void main(String args[])
    {
        jprogressbar j=new jprogressbar();
    }
}
