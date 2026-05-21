import java.util.*;
class Computer{
    void display(){
        System.out.println("Technical");
    }
}
class Tech extends Computer{
    void display(){
        super.display();
        System.out.println("Program");
    }
}
public class Super{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
            Tech t = new Tech();
            t.display();
        }
    }
