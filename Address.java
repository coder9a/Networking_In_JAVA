import java.io.*;
import java.net.*;

public class Address
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a website");
        String site = br.readLine();
        try
        {
            Inet4Address ip = (Inet4Address) Inet4Address.getByName(site);
            System.out.println("the IP Address is: "+ ip);
        }
        catch (UnknownHostException ue)
        {
            System.out.println("Website not found");
        }
    }
}
