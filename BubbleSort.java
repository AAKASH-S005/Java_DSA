3) Bubble Sort Code implemementation -> A simple sorting algorithm that finds the final sorted array by swapping the adjacent elements of the array if they are in wrong order
CODE :
import java.util.*;
public class BubbleSort{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        bubbleSort(arr);
        printArr(arr);
    }
}
