Write a program to print first 5 values which are divisible by 2, 3, and 5.

CODE :
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=0;
        while(true){
            if(n%2==0 && n%3==0 && n%5==0){
                f++;
                System.out.print(n+" ");                
                if(f==5){
                    break;
                }
            }
            n++;
        }
    }
}
