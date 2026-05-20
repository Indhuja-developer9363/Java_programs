import java.util.*;

public class Reverse{
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 1234
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev = (rev*10)+digit;
            num=num/10;
        }    
        System.out.println("Reversed number : "+rev);  //4321

        // for(int i=10;i>=1;i--){
        //     System.out.print(i+" ");   //10 9 8 7 6 5 4 3 2 1
        }
}