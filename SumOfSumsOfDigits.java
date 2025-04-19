Sum of sums of digits 
input : 582109
output : 90 -> (5+8+2+1+0+9)+(5+8+2+1+0)+(5+8+2+1)+(5+8+2)+(5+8)+5

CODE :
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int sum = 0,ts = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        ts=sum;
        while(t>0){
            int d = t%10;
            sum-=d;
            ts+=sum;
            t/=10;
        }
        System.out.print(ts);
    }
}
