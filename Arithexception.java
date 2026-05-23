import java.util.*;
public class Arithexception{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try{
            int num1=s.nextInt();  //5
            int num2=s.nextInt();  //0
            System.out.println(num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}