To check whether a number is Prime or not

CODE :
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print("Not a Prime Number");
                return;
            }
        }
        System.out.print("Prime Number");
    }   
}
