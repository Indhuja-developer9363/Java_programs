import java.util.Scanner;

public class Factors{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int fac = sc.nextInt();
        for(int i=0;i<=20;i++){
            if(fac%i==0){
                System.out.print(i+" ");
            }
        }
    }
}