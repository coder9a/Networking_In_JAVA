import java.net.*;

public class MyURL
{
    public static void main(String[] args) throws MalformedURLException
    {
        URL obj = new URL("http://www.github.com");
        System.out.println("Protocol : "+obj.getProtocol());
        System.out.println("Host : "+obj.getHost());
        System.out.println("File : "+obj.getFile());
        System.out.println("Port : "+obj.getPort());
        System.out.println("Path : "+obj.getPath());
        System.out.println("External Form : "+obj.toExternalForm());
    }
}
