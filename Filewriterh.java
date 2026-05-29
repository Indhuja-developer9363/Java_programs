import java.io.FileWriter;
import java.io.IOException;

public class Filewriterh{
    public static void main(String[]args){

        try{
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello,Welcome to java file handling!");
            writer.close();

            System.out.println("Successfully written.");
        }
        catch(IOException e){
            System.out.println("Error occured");
        }
    }
}