import java.util.*;

public class Expriority{
    public static void main(String[]args){
        PriorityQueue<Character> c= new PriorityQueue<>();
        c.offer('A');
        c.offer('G');
        c.offer('D');
        System.out.println(c);
        c.poll();
        System.out.println(c);
    }
}