import java.util.*;
public class Arraylist{
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println("0th index value ="+list.get(0)); //10
        System.out.println("Total size="+list.size());   //4
        System.out.println(list.remove(0));             //10  [20,30,40]
        System.out.println(list);
        System.out.println(list.contains(20));  //for performing searching operations
        // for(int value:list)
        // System.out.print(value+" ");
            }
}