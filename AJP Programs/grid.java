import java.awt.*;


public class grid {
    grid()
    {
        Frame f=new Frame("frame");
        Label l1=new Label("hello");
        Label l2=new Label("hello");
        Label l3=new Label("hello");
        Label l4=new Label("hello");
        Label l5=new Label("hello");

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);

        f.setSize(500,500);
        f.setLayout(new GridLayout(5,5));
        f.setVisible(true);

    }
    public static void main(String []args)
    {
        grid g=new grid();
    }
    
}
