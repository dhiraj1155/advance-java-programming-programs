import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class jtreeEx1
{
 public static void main(String args[])
 {
 	JFrame f=new JFrame("jtree");
	f.setBounds(50,50,500,500);
	f.setVisible(true);
	//f.setLayout(new FlowLayout());
	
	DefaultMutableTreeNode India=new DefaultMutableTreeNode("India");

	DefaultMutableTreeNode mh=new DefaultMutableTreeNode("maharashtra");
	DefaultMutableTreeNode mumbai= new DefaultMutableTreeNode("mumbai");
		DefaultMutableTreeNode delhi=new DefaultMutableTreeNode("delhi");
		DefaultMutableTreeNode kullu=new DefaultMutableTreeNode("kullu");

	DefaultMutableTreeNode Gujrat=new DefaultMutableTreeNode("Gujrat");

	India.add(mh);
	mh.add(mumbai);mh.add(delhi);mh.add(kullu);
	India.add(Gujrat);

	JTree jt= new JTree(India);
	f.add(jt);
 }
}