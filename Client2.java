//For 2 way communication  -  server
import java.io.*;
import java.net.*;
public class Client2
{
    public static void main(String[] args) throws IOException
    {
        Socket s = new Socket("localhost", 888);
//        To send data to the server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//        To read data coming from server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        To get data from keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;
//        repeat as long as exit is not typed at client
        while(!(str1 = kb.readLine()).equals("exit"))
        {
            dos.writeBytes(str1+"\n");    // send to server
            str2 = br.readLine();    // receive from server
            System.out.println(str1);
        }
//        close the connection
        dos.close();
        br.close();
        kb.close();
        s.close();


    }
}
