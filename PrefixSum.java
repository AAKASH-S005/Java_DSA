Prefix sum using Java Array

CODE:
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] A = {6,3,-2,4,-1,0,-5};
        int n = A.length;
        // Prefix Sum for given n input size of an Array -> O(n) Time Complexity
        for(int i=1;i<n;i++){
            A[i] = A[i]+A[i-1];
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+"  ");
        }
        // Prefix sum for given range
        // Formula - A[i,j] = A[j]-A[i-1]; -> O(1) Time Complexity
        System.out.println();
        int Range = A[6]-A[2-1];
        System.out.print(Range);
    }
}
