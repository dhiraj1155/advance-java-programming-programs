import java.awt.*;

public class framedemo
{
 framedemo()
 {
 	Frame f=new Frame("myFrame");
	Label l1=new Label("name");
	Button b1=new Button("submit");
	f.setSize(300,300);
	f.setVisible(true);
	f.setLayout(new FlowLayout());
	f.add(l1);
	f.add(b1);
 }

public static void main(String args[])
{
 	framedemo f=new framedemo();
}
}