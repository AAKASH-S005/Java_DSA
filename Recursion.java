All Recursion Example Codes in Java

CODE :

// Number of Digits in a number using recursion
import java.io.*;
import java.util.*;
public class Solution {
    public static int NumOfDigits(int N){
        if(N==0){
            return 0;
        }
        else{
            return 1+NumOfDigits(N/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = NumOfDigits(N);
        System.out.print("The number of digits in "+N+" is "+res);
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
