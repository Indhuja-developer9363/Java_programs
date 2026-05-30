import java.io.FileWriter;
import java.io.IOException;

public class Appendingfile{
    public static void main(String[]args){

        try{
            FileWriter writer = new FileWriter("samples.txt");

            writer.write("\nThis is appended text.");
            writer.close();
            System.out.println("Data appended.");
        }
        catch(IOException e){
            System.out.println("Error occured");
        }
    }
}