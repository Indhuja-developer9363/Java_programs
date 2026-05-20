import java.util.*;

public class Marks{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // String b = sc.nextLine();
        if(a>=90 && a<=100){
            System.out.println("grade A");
        }
        if(a>=80 && a<=89){
            System.out.println("grade B");
        }
        if(a>=70 && a<=79){
            System.out.println("grade C");
        }
        if(a>=60 && a<=69){
            System.out.println("grade D");
        }
        if(a>=50 && a<=59){
            System.out.println("grade E");
        }
        else if(a>=0 && a<=49){
            System.out.println("No grade");
        }
        else{}
    }
}