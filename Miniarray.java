import java.util.*;

public class Miniarray{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);

        int arr[]=new int[5];
        //int min = 0;
        for(int i=0;i<5;i++){

             arr[i]=obj.nextInt();
        }
        int min = arr[0];
            for(int i=1;i<5;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}
