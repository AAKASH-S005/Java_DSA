Code to print the Second largest element in the Array

CODE :

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int max = 0,min = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int SecMax = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>min && arr[i]<max){
                SecMax = arr[i];
            }
        }
        System.out.println();
        System.out.println("The Second Largest element in the Array is : "+SecMax);
    }
}
