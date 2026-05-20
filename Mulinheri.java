//MULTILEVEL INHERITANCE
class Student{
    void display(){
        System.out.println("CSE");
    }
}
class Staff extends Student{
    void details(){
        System.out.println("CSE "+"IT "+"ECE "+"AIDS");
    }
}
class Principle extends Staff{
    void get(){
        System.out.println("All Departments in Engineering");
    }
}
public class Mulinheri{
    public static void main(String[]args){
        Principle pc = new Principle();
        pc.get();
        pc.details();
        pc.display();
        Staff s=new Staff();
        s.details();
        s.display();
    }
}