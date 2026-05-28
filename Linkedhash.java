import java.util.*;

public class Linkedhash{
    public static void main(String[]args){
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(12);
        l.add(34);
        l.add(54);
        l.add(32);
        l.add(32);
        System.out.println(l);
        l.remove(34);
        System.out.println(l);
    }
}