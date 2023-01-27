import java.awt.*;

public class extending_frame_class extends Frame
{
 extending_frame_class()
 {
	
  	Button b1=new Button("click me");
	Label l1=new Label("hello!");
  
	setSize(300,300);
 	setLayout(new FlowLayout());
  	setVisible(true);	
	add(l1);
 	add(b1);	
 }
public static void main(String args[])
{
 extending_frame_class c1=new extending_frame_class();
}
} 