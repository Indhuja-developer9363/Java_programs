import java.util.*;
public class Vectors{
    public static void main(String[]args){
        Vector<Integer>arr=new Vector<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        arr.remove(1);      //index value
        System.out.println(arr);
    }
}