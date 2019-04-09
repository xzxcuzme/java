import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;


class Server {
    public static void main(String argv[]) throws Exception
    {

        ServerSocket server = new ServerSocket (9000);
        while (true) {
            Socket connectionSocket = server.accept();
            //System.out.println("1234");
            InputStream inStream = connectionSocket.getInputStream();
            OutputStream outStream = connectionSocket.getOutputStream();
            Scanner in = new Scanner(inStream);
            PrintWriter out = new PrintWriter(outStream);
            String str = in.nextLine();
            System.out.println(str);
            out.println ("FROM SERVER:" + str);
            out.flush();
            connectionSocket.close();
        }
    }
}