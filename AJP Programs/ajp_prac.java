import java.awt.*;

public class ajp_prac 
{
    ajp_prac()
    {
        Frame f=new Frame("myFrame");
        Label l1=new Label("name");
        TextField t1=new TextField(10);
        Label l2=new Label("address");
        TextArea ta=new TextArea(10,20);
      

        Label l3=new Label("select language");
        Choice c1= new Choice();
        c1.add("hindi");
        c1.add("english");
        c1.add("marathi");
      
        Label l4=new Label("selct subject");

        Checkbox cb1=new Checkbox("ajp");
        Checkbox cb2=new Checkbox("osy");
        Checkbox cb3=new Checkbox("css");

        Label l5=new Label("gender");

        CheckboxGroup cbg=new CheckboxGroup();

        Checkbox cb0=new Checkbox("male",cbg,true);
        Checkbox cb01=new Checkbox("female",cbg,false);

        List li1=new List();

        li1.add("mumbai");
        li1.add("delhi");
        li1.add("chennai");

        f.add(l1);f.add(t1);f.add(l2);f.add(ta);f.add(l3);f.add(c1);f.add(l4);f.add(cb1);f.add(cb2);f.add(cb3);
        f.add(l5);f.add(cb0);f.add(cb01);f.add(li1);

        f.setSize(500,500);
        f.setLayout(new BorderLayout());
        f.setVisible(true);


    }
    public static void main(String args[])
    {
        ajp_prac a=new ajp_prac();
    }
}