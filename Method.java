import java.util.*;

public class Method{
    //void good(){}//declaration
    void displayMessage(){   //definition
        System.out.println("Hello");  
    }
    public static void main(String[]args){
        Main m = new Main();  //object creation
        System.out.println(Math.sqrt(20));  //predefined method
        m.displayMessage();  //method calling
    }
}