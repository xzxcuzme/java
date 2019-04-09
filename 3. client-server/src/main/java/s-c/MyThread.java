import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;


public class MyThread
{
    public static void main(String [] args) {
        try
        {
            int i = 1;
            ServerSocket s = new ServerSocket (9000);
            while(true){
                Socket incoming = s.accept();
                System.out.println("Spawning " + i);
                Runnable r = new ThreadedEchoHandler(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        }
        catch (IOException e)
        {
           e.printStackTrace();
        }
    }
}

class ThreadedEchoHandler implements Runnable {
    private Socket incoming;

    public ThreadedEchoHandler(Socket i) {
        incoming = i;
    }

    public void run() {
        try {
            //System.out.println("1234");
            InputStream inStream = incoming.getInputStream();
            OutputStream outStream = incoming.getOutputStream();
            Scanner in = new Scanner(inStream);
            PrintWriter out = new PrintWriter(outStream);
            String str = in.nextLine();
            System.out.println(str);
            out.println("FROM SERVER:" + str);
            out.flush();
            incoming.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
