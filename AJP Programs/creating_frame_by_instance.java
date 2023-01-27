import java.awt.*;

public class creating_frame_by_instance
{
  creating_frame_by_instance()
  {
   Frame f=new Frame("myframe");
   Button b1=new Button("click me");
   f.add(b1);
   f.setSize(300,300);
   f.setVisible(true);
   f.setLayout(null);

  }
 public static void main(String args[])
 {
  creating_frame_by_instance c1=new creating_frame_by_instance();
    
 }
}