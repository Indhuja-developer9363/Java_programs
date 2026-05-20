import java.util.*;

class Bankd{
    String Account_holdername;
    int Account_no;
    int Balance;
    void  display()
    {
        //local variable
        int a=10;    //if ew dont initialize the value it will be error -  int a; //error
        System.out.println(a);

        System.out.println(Balance);
    }
    //default constructor
    Bankd(){

        System.out.println("Engineering");
    }
}
public class Bank{
    public static void main(String[]args){
        Bankd b1 = new Bankd();
        b1.Account_holdername="Indhu";
        b1.Account_no=20;
        b1.Balance=10000;
        b1.display();
    }
}