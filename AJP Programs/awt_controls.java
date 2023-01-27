import java.awt.*;

public class awt_controls
{
	awt_controls()
	{
	Frame f=new Frame("controls");
	Label l1=new Label("name");
	TextField t1=new TextField(10);
	TextArea ta1=new TextArea(2,20);
	CheckboxGroup cbg =new CheckboxGroup();
	Checkbox c1=new Checkbox("ajp",cbg,true);
	Checkbox c2=new Checkbox("osy",cbg,false);
	Checkbox c3=new Checkbox("ajp");
	Checkbox c4=new Checkbox("osy");
	Button b1=new Button("Submit");
	
	f.setSize(500,500);
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	f.add(l1);f.add(t1);f.add(ta1);f.add(c1);f.add(c2);f.add(b1);f.add(c3);f.add(c4);
	}

public static void main(String args[])
{
	awt_controls a=new awt_controls();
} 
}
