import java.util.*;

public class Nestedloop{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // for(int i=1;i<=3;i++){          // fisrt loop represent rows
        //     for(int j=1;j<=3;j++){      // second loop represent coloums
        //         System.out.println("*"+" ");      //* * *
        //     }                                     //* * *
        //     System.out.println();                 //* * *
        // }

        // for(int i=1;i<=3;i++){                   
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");        // *
        //     }                                     // * *
        //     System.out.println();                 // * * *
        // }


        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || i==n || j==1 || j==n){
        //         System.out.print("*");               //*****
        //         }                                    //*   *
        //         else{                                //*   *
        //             System.out.print(" ");           //*   *
        //         }                                    //*****
        //     }
        //     System.out.println();
        // }

        for(int i=5;i>=1;i--){                    //* * * * *
            for(int j=1;j<=i;j++){                //* * * *
                System.out.print("*"+" ");        //* * *
            }                                     //* *
            System.out.println();                 //*
        }
    }
}