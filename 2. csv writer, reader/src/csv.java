import com.opencsv.CSVWriter;

import java.io.*;

public class csv {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("C:/Users/Игшорь/Documents/GitHub/java/2. csv writer, reader/src/data.csv"))
        {
            int c;

            String newcsv = "C:/Users/Игшорь/Documents/GitHub/java/2. csv writer, reader/src/dataout.csv";
            PrintWriter writer = new PrintWriter(new FileWriter(newcsv));



            while((c=reader.read())!=-1){
                System.out.print((char)c);
                writer.println("Hllo worl!");
               // String [] country = "India#China#United States".split("#");
                //writer.writeNext(country);
                //writer.close();
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}