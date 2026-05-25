import java.util.*;
public class Collection{
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        System.out.println(list);   //5,3,2,6
        Collections.sort(list);     //2,3,5,6
        System.out.println(list);
        Collections.reverse(list);  //6,5,3,2
        System.out.println(list);
    }
}