Remove Duplicates in an Array (Naive approach in Java)

CODE :

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i] == arr[j]){
                    for(int k=j;k<=n-2;k++){
                        arr[k] = arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
