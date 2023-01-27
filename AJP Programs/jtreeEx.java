import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

 public class jtreeEx {
    public static void main(String args[]) {

        JFrame f = new JFrame("Jtree");
        f.setVisible(true);
        f.setBounds(50,50,500,500);

        DefaultMutableTreeNode India = new DefaultMutableTreeNode("India");
        
        DefaultMutableTreeNode mh = new DefaultMutableTreeNode("Maharashtra");
        
        DefaultMutableTreeNode mumbai = new DefaultMutableTreeNode("mumbai");
        DefaultMutableTreeNode pune = new DefaultMutableTreeNode("pune");
        DefaultMutableTreeNode nashik = new DefaultMutableTreeNode("nashik");
        DefaultMutableTreeNode nagpur = new DefaultMutableTreeNode("nagpur");
        
        DefaultMutableTreeNode gujarat = new DefaultMutableTreeNode("gujarat");


        // Adding maharashtra to India
        India.add(mh);

        // Adding Cities to Maharashtra
        mh.add(mumbai);
        mh.add(pune);
        mh.add(nashik);
        mh.add(nagpur);

        // Adding Gujarat to India
        India.add(gujarat);

         //Creating a tree
         JTree jt = new JTree(India);

        // Adding Jtree to frame
        f.add(jt);







    }

}
