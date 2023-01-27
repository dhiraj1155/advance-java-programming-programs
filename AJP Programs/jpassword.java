import javax.swing.*;

public class jpassword
{
    jpassword()
    {
        JFrame f=new JFrame("myframe");
        JTextField j=new JTextField(10);
        JPasswordField jf=new JPasswordField(10);
        f.add(jf);
        f.add(j);
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500,500);
    }
    public static void main(String args[])
    {
        jpassword obj=new jpassword();
    }

}
