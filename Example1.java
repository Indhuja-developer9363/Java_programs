import java.util.*;

public class Example1{
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int even=0;
        int odd=0;
        for(int value:list){
        if(value%2==0)
            even++;
        
        else
            odd++;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}