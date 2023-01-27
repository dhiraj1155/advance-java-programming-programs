// import java.awt.*;
// import javax.swing.*;

// public class jtabeldemo {
    
//     public static void main(String [] a)
//     {
//         JFrame f=new JFrame("jtabel_demo");
//         f.setSize(500,500);
//         f.setVisible(true);
//         f.setLayout(new FlowLayout());

//         String cols[]={"id","name","roll"};

//         String rows[][]={
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"},
//             {"1","dhiraj","246"},
//             {"2","ishan","234"},
//             {"3","darshan","245"}


//         };

//         JTable jt=new JTable(rows,cols);

//         JScrollPane sc=new JScrollPane(jt);

//         f.add(sc);

//     }
// }



import javax.swing.*;
import java.awt.*;

public class jtabeldemo 
{
    public static void main(String[]a)
    {
        JFrame f=new JFrame("jtabel");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());

        String cols[]={"id","name","roll"};

        String rows[][]={
            {"1","dhiraj","1"},
            {"1","dhiraj","1"},
            {"1","dhiraj","1"}
        };

        JTable jt=new JTable(rows,cols);

        JScrollPane sc=new JScrollPane(jt);

        f.add(sc);
    }
}
