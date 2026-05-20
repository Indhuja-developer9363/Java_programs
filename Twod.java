import java.util.*;

public class Twod{
public static void main(String[]args){
Scanner obj = new Scanner(System.in);
int rowsize=obj.nextInt();
int colsize=obj.nextInt();
for(int i=0;i<rowsize;i++){
    for(int j=0;j<colsize;j++){
        arr[i][j]=obj.nextInt();
    }
    System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}      