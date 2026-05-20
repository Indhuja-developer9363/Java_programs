import java.util.*;

//Addition and Reversing array

public class Array{
    public static void main(String[]args){

        Scanner obj = new Scanner(System.in);

        //int marks[]={10,20,30,40}; //initialization

        int arr[]=new int[5];      //array creation -> 0 0 0 0
        // int sum =0;
        for(int i=0;i<5;i++){     //0 1 2 3
            arr[i]=obj.nextInt();  //10 20 30 40 50
            // sum = sum+arr[i];
        }
        for(int i=4;i>=0;i--){     //0 1 2 3 4
            System.out.print(arr[i]+" ");
        }
        // System.out.println();
        // System.out.println(sum);
    }
}