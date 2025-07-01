1) Insertion sort code implementation -> A Simple sorting algorithm that returns the final sorted array each item at a time by repeatedly inserting the next element into its correct position
CODE :
import java.util.*;
public class InsertionSort{
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    
    public static void printArr(int[] arr){
        for(int value : arr){
            System.out.print(value+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        printArr(arr);
        insertionSort(arr);
        System.out.println("Sorted Array using Insertion Sort : ");
        printArr(arr);
    }
}
