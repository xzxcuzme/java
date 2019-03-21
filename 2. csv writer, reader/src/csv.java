import java.io.*;

public class csv {

    public static void main(String[] args) {
        String newcsv = "C:/Users/Игшорь/Documents/GitHub/java/2. csv writer, reader/src/dataout.csv";
        try(FileReader reader = new FileReader("C:/Users/Игшорь/Documents/GitHub/java/2. csv writer, reader/src/data.csv"))
        {
            int c;
            PrintWriter writer = new PrintWriter(new FileWriter(newcsv));
            while((c=reader.read())!=-1){
                System.out.print((char)c);
                writer.println((char)c + "           ");
             }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}