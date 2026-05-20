class Student{
    void display(){
        System.out.println("............");
        System.out.println("Assessment completed");
        System.out.println("||| year");
    }
}
class Trainer extends Student{
    void details(){
        System.out.println("All the students are pass their exam");
    }
}
public class Inheri{
    public static void main(String[]args){
        Trainer t =new Trainer();
        t.details();
        t.display();
    }
}