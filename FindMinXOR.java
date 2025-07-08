You are given an array A of size N which needs to divide the array into one or more contiguous intervals. 
For each interval created. It needs to calculate the bitwise OR of all the elements in that interval and 
then determine the bitwise XOR of all the values she gets by doing the OR of the respective intervals.
your task is to find and return an integer value representing the minimum possible XOR value that can achieve 

CODE :
import java.util.*;
public class FindMinXOR{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int minXOR = Integer.MAX_VALUE;
        int totalPartitions = 1 << (n-1);
        for(int mask = 0;mask<totalPartitions;mask++){
            int orVal = arr[0];
            int xorVal = 0;
            for(int i=1;i<n;i++){
                if((mask & (1 << (i-1))) != 0){
                    xorVal ^= orVal;
                    orVal = arr[i];
                }
                else{
                    orVal |= arr[i];
                }
            }
            xorVal ^= orVal;
            if(xorVal < minXOR){
                minXOR = xorVal;
            }
        }
        System.out.print("Minimum XOR value is "+minXOR);
    }
}
