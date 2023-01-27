import java.net.*;
import java.util.*;


public class IPdemo {

    public static void main(String []a)
    {
        String host;
        Scanner input=new Scanner(System.in);
        
        System.out.println("\n Enter host name");

        host=input.nextLine();

        try
        {
        InetAddress address=InetAddress.getByName(host);
        
        System.out.println("host name is "+address.getHostName());
        System.out.println("Ip address is "+address.getHostAddress());
        System.out.println("ip and name is "+address.toString());
        }
        catch(UnknownHostException ex)
        {
            System.out.println("could not fount");
        }
    }
    


    
}
