import java.util.*;

public class Priorityque{
    public static void main(String[]args){
        PriorityQueue<Integer>p=new PriorityQueue<>();
        p.offer(20);
        p.offer(5);
        p.offer(12);
        System.out.println(p);  //5 20 12
        p.poll();  //20 12
        System.out.println(p);   //12 20
        System.out.println(p.peek());  //12
    }
}