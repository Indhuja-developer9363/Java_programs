interface A{
    void display();
}
class B implements A{
    public void display(){
        System.out.println("Pure Abstraction");
    }
}
public class Interface{
    public static void main(String[]args){
        B obj = new B();
        obj.display();
    }
}