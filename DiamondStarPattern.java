Diamond start pattern in java
input : n = 5
output : 
    *
   * *
  * * *
 * * * *
* * * * * 
 * * * *
  * * *
   * *
    *

CODE :
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
