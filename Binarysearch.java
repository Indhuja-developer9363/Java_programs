import java.util.*;
public class Binarysearch{
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(1);
        int position=Collections.binarySearch(list,2);
        System.out.println(position);
    }
}