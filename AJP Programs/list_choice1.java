import java.awt.*;

public class list_choice1
{
	list_choice1()
	{
	 	Frame f1=new Frame("frame");
		List l1=new List(2);
		l1.add("mumbai");
		l1.add("mumbai");
		l1.add("mumbai");
		l1.add("mumbai");
		f1.add(l1);

		Choice c1=new Choice();
		c1.add("delhi");
		c1.add("delhi");
		c1.add("delhi");
		c1.add("delhi");
		
		
		f1.add(c1);

		f1.setSize(300,300);
 		f1.setLayout(new GridLayout(1,2));
  		f1.setVisible(true);
	}

public static void main(String args[])
{
	list_choice1 c=new list_choice1();
} 
}
