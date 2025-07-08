Java code to serach an element in an array using Binary search
CODE :
import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int indexFound = -1;
        int left = 0,right = n-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target){
                indexFound = mid;
                break;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        if(indexFound != -1){
            System.out.print("The Element "+target+" is found at the index "+indexFound);
        }
        else{
            System.out.print("The Target "+target+" is not found");
        }
    }
}
