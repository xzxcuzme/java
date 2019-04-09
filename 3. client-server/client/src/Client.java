import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client {
    public static void main(String argv[]) throws Exception
    {
        Socket clientSocket = new Socket ("127.0.0.1", 9000);
        InputStream inStream = clientSocket.getInputStream();
        OutputStream outStream = clientSocket.getOutputStream();
        Scanner in = new Scanner(inStream);
        PrintWriter out = new PrintWriter(outStream);
        out.write("111 \n");
        out.flush();
        String str = in.nextLine();
        out.write ("FROM SERVER:" + str);
        System.out.println(str);
        out.flush();
        clientSocket.close();
    }
}