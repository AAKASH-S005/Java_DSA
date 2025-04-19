Replace the largest element in the position of the smallest element

input : n = 6 {6,7,4,3,5,2}
output : {7,5,5,5,2,0};

CODE :
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=i+1;j<n;j++){
                max = Math.max(max,a[j]);
            }
            a[i] = max;
        }
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}
