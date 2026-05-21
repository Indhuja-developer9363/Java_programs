import java.util.*;

abstract class Picture{
    abstract void area(int size);  //declaration
    void fun(){    //definition
        System.out.println("Java Program");
    }
}
class Square extends Picture{
    void area(int side){
        System.out.println(side*side);
    }
    }
    public class Abstraction{
        public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           int side = sc.nextInt();
           Square st = new Square();
           st.area(side);
           st.fun();
        }
    }