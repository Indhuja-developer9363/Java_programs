class Employee{
    private void display(){
        System.out.println("Hello...");
    }
    public void get(){
        display();
    }
}

public class Main{
    public static void main(String[]args){
        Employee e = new Employee();
        e.get();
    }
}