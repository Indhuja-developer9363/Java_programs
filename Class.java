import java.util.*;

class Student{
    //variable

    String name;
    int rollno;

    //methods

    void display(){

System.out.println(name);
        System.out.println(rollno);
    }
}
public class Class{
    public static void main(String[]args){
        Student s1=new Student(); //object creation
        s1.name="Dharsh";
        s1.rollno=233;
        s1.display();
        Student s2=new Student();
        s2.name="praveen";
        s2.rollno=299;
        s2.display();
    }
}