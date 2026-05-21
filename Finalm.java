class Parent{
    final void show(){
        System.out.println("Program");
    }
}
class Child extends Parent{
}
public class Finalm{
    public static void main(String[]args){
        Child c = new Child();
        c.show();
    }
}