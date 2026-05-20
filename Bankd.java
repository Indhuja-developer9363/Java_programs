import java.util.Scanner;

public class Bankd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
            int amount = sc.nextInt();
            int withdraw = sc.nextInt();
            if(amount>=withdraw){
                amount=amount-withdraw;
                System.out.println(withdraw+" withdraw success");
                System.out.println(amount+" current Balance");
            }
            else{
                System.out.println("Transaction failed");
            }
        }
    }
