class College{
    College(){
        this(100);
        System.out.println("Default Constructor");
    }
    College(int id){
        System.out.println("Parameterized constuctor");
    }
}
public class Const{
    public static void main(String[]args){
        College c = new College();
    }
}