Difference between Sum of Odd and Even elements in an Array

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
        int OddSum = 0,EvenSum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                EvenSum+=arr[i];
            }
            if(arr[i]%2==1){
                OddSum+=arr[i];
            }
        }
        int Diff = OddSum - EvenSum;
        System.out.println("Difference : "+Diff);
    }
}
