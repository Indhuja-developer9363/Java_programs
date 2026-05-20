// Prime number -> the number which is divisible by 1 and itself.

import java.util.Scanner;

public class Prime{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        for( int i=2;i<prime/2;i++){        // prime/2 -> namba kudukkura input la paadhi
            if(prime%i==0){
                System.out.println(" Not a Prime");
                return;
            }
            else{
                System.out.println("Prime");
            }
        }
    }
}