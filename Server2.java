//For 2 way communication  -  server
import java.io.*;
import java.net.*;

public class Server2
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(888);
        Socket s = ss.accept();
        System.out.println("Connection Established");
        PrintStream ps = new PrintStream(s.getOutputStream());
//        To read data coming from client
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        To read data from keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String str1, str2;
            while((str1 = br.readLine())!=null)  // read from client
            {
                System.out.println(str1);
                str2 = kb.readLine();
                ps.println(str2);   // sent to client
            }
//            close connection
            ps.close();
            br.close();
            kb.close();
            ss.close();
            s.close();
        }
    }
}
