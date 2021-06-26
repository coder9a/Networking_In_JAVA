import java.io.*;
import java.net.*;

public class Client1
{
    public static void main(String[] args) throws IOException
    {
//        Create a client socket with same port number
        Socket s = new Socket("localhost", 777);

//      To read data coming from server, attach InputStream to the socket
        InputStream obj = s.getInputStream();

//        To read data from socket into the client, use BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(obj));

//        Receiving Strings
        String str;
        while((str = br.readLine())!=null)
            System.out.println("from server : "+str);

//        Close connection by closing the streams and sockets
        br.close();
        s.close();
    }
}
