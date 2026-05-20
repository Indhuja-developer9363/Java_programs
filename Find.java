import java.util.*;
//array searching - linear searching
public class Find{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=obj.nextInt();
        }
        int key = obj.nextInt();
        int count=0;
        for(int i=0;i<5;i++){
            if(arr[i]==key){
                count++;
                System.out.println(i);
                break;
            }
        }
        if(count==0){
            System.out.println("no element");
        }
    }
}