import java.net.URL.*;
import java.net.MalformedURLException;
import java.net.URL;


public class retriveURL  {

    public static void main(String []args) throws MalformedURLException
    {
        URL url=new URL("https://msbte.org.in/");
        System.out.println("authority"+url.getAuthority());
        System.out.println("port"+url.getPort());
        System.out.println("file"+url.getFile());
        System.out.println("path"+url.getPath());
        System.out.println("protocol"+url.getProtocol());
    }
    
}
