import java.util.*;

public class Queues{
    public static void main(String[]args){
        Queue <Integer> q = new LinkedList<>();
        q.offer(22);
        q.offer(56);
        q.offer(74);
        q.offer(84);
        System.out.println(q);    //22 56 74 84
        q.poll();
        System.out.println(q);      //56 74 84
        System.out.println(q.peek());    //56
        System.out.println(q.size());    //3
        System.out.println(q.contains(53));  //false
    }
}