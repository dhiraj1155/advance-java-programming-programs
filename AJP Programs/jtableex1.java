// public 7)Program of JTable

import javax.swing.*;
import java.awt.*;
public class jtableex1 {
    static JFrame f = new JFrame("Frame Title");

    public static void main(String args[]) {
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500,500);
        


        // Create string with Column names
        String col[] = { "id", "Name", "Roll" };

        // Create rows with data
        String rows[][] = {
                { "1", "vivek", "1" },
                { "2", "vivek2", "2" },
                { "3", "vivek3", "3" },
                { "4", "vivek4", "4" }
        };


        // create a JTable obj and
        //  pass rows and column string obj as parameter 
        JTable jt = new JTable(rows, col);


        // Create JScrollPane and pass JTable obj as parameter
        JScrollPane sc = new JScrollPane(jt);


        // Add JScrollPane to frame
        f.add(sc);
        
    }
} 
