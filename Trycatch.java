import java.util.*;
public class Trycatch{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try{
            int num1=s.nextInt();  //5
            int num2=s.nextInt();  //0
            System.out.println(num1/num2);
        }
        catch(Exception e){
            System.out.println("b cannot be zero");
        }
    }
}