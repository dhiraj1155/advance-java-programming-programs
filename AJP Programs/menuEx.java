import java.awt.*;

public class menuEx
{
 menuEx()
{
	Frame f=new Frame("My Frame");
	MenuBar mb=new MenuBar();
	Menu m1= new Menu("file");
	Menu m2=new Menu("view");
	Menu m3=new Menu("edit");	
	
	MenuItem mn1=new MenuItem("create");
	MenuItem mn2=new MenuItem("open");
	MenuItem mn3=new MenuItem("close");

	
	mb.add(m1);

	m1.add(mn1);m1.add(mn2);m1.add(mn3);

	mb.add(m2);mb.add(m3);
	
	f.setMenuBar(mb);
	
	f.setSize(300,300);
	f.setVisible(true);	
	f.setLayout(new FlowLayout());

}
public static void main(String args[])
{
	menuEx m=new menuEx();
}
}