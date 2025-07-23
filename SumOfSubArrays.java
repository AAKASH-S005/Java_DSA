Given an array arr[], find the sum of all the subarrays of the given array.
CODE:
import java.util.*;
public class SumOfSubArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i] * (i+1) * (n-i);
        }
        System.out.println("Sum of Sub Arrays of the Main Array is "+sum);
    }
}
