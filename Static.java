import java.util.*;
class Student{
    static String college = "Shanmugha";  //static -> variable
    int rollno;  //normal variable
    Student(int rollno){
        this.rollno = rollno;  //101
    }
    void display(){
        System.out.println(college+" "+rollno);
    }
}
public class Static{
    public static void main(String[]args){
        Student s = new Student(101);
        Student st = new Student(102);
        s.display();
        st.display();
    }
}