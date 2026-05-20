import java.util.*;

public class Example{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        while(true){
            int num = sc.nextInt();;
            if(num==-1){
                break;
            } 
            System.out.println("You Entered : "+num);
        }
    }
}