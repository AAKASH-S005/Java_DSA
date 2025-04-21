Code to print the First, Second and Third largest element in an Array

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
        Arrays.sort(a);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int Fmax = a[n-1];
        int Smax = a[n-2];
        int Tmax = a[n-3];
        System.out.println("First maximum element is "+Fmax);
        System.out.println("Second maximum element is "+Smax);
        System.out.println("Third maximum element is "+Tmax);


    }
}
