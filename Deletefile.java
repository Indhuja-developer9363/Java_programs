import java.io.File;

public class Deletefile{
    public static void main(String[]args){

        File file = new File("sampless.txt");

        if(file.delete()){
            System.out.println("Deleted the file: "+file.getName());
        }
        else{
            System.out.println("Failed to delete.");
        }
    }
}