import java.util.*;
public class Hashsetc{
    public static void main(String[]args){
        HashSet<Integer>s=new HashSet<>();
        s.add(10);
        s.add(43);
        s.add(24);
        s.add(23);
        s.add(10);
        System.out.println(s); // remove duplicate element
        s.remove(23);
        System.out.println(s);
    }
}