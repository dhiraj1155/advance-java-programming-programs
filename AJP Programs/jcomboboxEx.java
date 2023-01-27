import java.awt.*;
import javax.swing.*;

public class jcomboboxEx
{
	jcomboboxEx()
	{
	Frame f=new Frame("my frame");
	f.setSize(500,500);
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	
	String s[]={"english","hindi","marathi","bengali","tamil","urdu"};
	JComboBox cb=new JComboBox(s);
	cb.setBounds(50,50,150,150);
	f.add(cb);
	}
public static void main(String args[])
{
	jcomboboxEx j1=new jcomboboxEx();	
}
		
}