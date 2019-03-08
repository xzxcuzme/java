import java.io.*;

public class csv {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("C:/Users/Игшорь/Documents/GitHub/java/2. csv writer, reader/src/data.csv"))
        {

            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}