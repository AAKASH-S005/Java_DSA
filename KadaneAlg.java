Kadane's Algorithm for finding maximum sum of contiguous subarray
CODE :
import java.util.*;
public class KadaneAlg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndsHere = 0;
        for(int i=0;i<n;i++){
            maxEndsHere = maxEndsHere+arr[i];
            if(maxSoFar < maxEndsHere){
                maxSoFar = maxEndsHere;
            }
            if(maxEndsHere < 0){
                maxEndsHere = 0;
            }
        }
        System.out.print("Maximum Sum is "+maxSoFar);
    }
}
