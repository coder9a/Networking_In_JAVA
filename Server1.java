//Server1 to send strings
import java.io.*;
import java.net.*;

public class Server1
{
    public static void main(String[] args) throws IOException
    {
//        Create a server socket with some port number
        ServerSocket ss = new ServerSocket(777);

//        Let the server wait till a client accepts connection
        Socket s = ss.accept();
        System.out.println("Connection Established");

//        Attach output stream to send data to the socket
        OutputStream obj = s.getOutputStream();

//        Attach print stream to send data to the socket
        PrintStream ps = new PrintStream(obj);

//        Send two strings to the client
        String str = "Hello Client!";
        ps.println(str);
        ps.println("Bye");

//        Close connection by closing the streams and sockets
        ps.close();
        ss.close();
        s.close();
    }
}
