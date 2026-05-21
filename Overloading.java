import java.util.*;

class Sum{
    void Numbers(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i+" ");
        }
    }
    void Numbers(int start,int n){
        for(int j=start;j<=n;j++){
            System.out.println(j+" ");
        }
    }
}
public class Overloading{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Numbers n = new Numbers();
        int Sum=sc.nextInt();
        n.Numbers(10);
        n.Numbers(11,15);
    }
}