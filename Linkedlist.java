import java.util.*;
public class Linkedlist{
    public static void main (String[]args){
        LinkedList<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println(list.get(1));  //20
        list.addFirst(100);               //100,10,20,30,40
        System.out.println(list);        
        list.addLast(80);                 //100,10,20,30,40,80
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}