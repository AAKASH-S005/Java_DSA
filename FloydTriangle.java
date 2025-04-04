Floyd's Triangle program in Java

CODE :

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    } 
}
