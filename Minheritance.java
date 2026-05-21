interface A{
    void display();  //declare
}
interface B{
    void show();  //declaration
}
class C implements A,B{
    public void display(){   //definition
       System.out.println("Definition of A");
    }  
    public void show(){   //definition
       System.out.println("Definition of B");
    }
}
public class Minheritance{
    public static void main(String[]args){
        C obj=new C();
        obj.display();
        obj.show();
    }
}