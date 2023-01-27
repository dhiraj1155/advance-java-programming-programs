import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class jtreedemo {

    public static void main(String []a)

    {
        JFrame f=new JFrame("jtree");
        f.setVisible(true);
        f.setBounds(50,50,500,500);

        DefaultMutableTreeNode India=new DefaultMutableTreeNode("India");

        DefaultMutableTreeNode mh=new DefaultMutableTreeNode("Maharashtra");

        DefaultMutableTreeNode mumbai=new DefaultMutableTreeNode("mumbai");
        DefaultMutableTreeNode delhi=new DefaultMutableTreeNode("delhi");
        DefaultMutableTreeNode chennai=new DefaultMutableTreeNode("chennai");
        DefaultMutableTreeNode nashik=new DefaultMutableTreeNode("nashik");

        India.add(mh);

        mh.add(mumbai);
        mh.add(delhi);
        mh.add(chennai);
        mh.add(nashik);

        JTree jt=new JTree(India);

        f.add(jt);
    }
    
}
