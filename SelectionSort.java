2) Selection Sort Java Code implementation -> A simple sorting algorithm that returns the final sorted array by repeatedly checking for the minimum element and placed it at the beginning
CODE :
import java.util.*;
public class SelectionSort{
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
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
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
