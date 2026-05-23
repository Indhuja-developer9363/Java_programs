//inputmismatchexception

import java.util.*;

public class Inputmis{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try{
            int num = s.nextInt();  //a
            System.out.println(num);
        }
        catch(InputMismatchException e){
            System.out.println("Input is not an numerical value");
        }
    }
}