// Special Numbers code in java

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalN = n;                   // Assign to another variable
        int LD = n % 10;  
        int FD = 0;  
        while (n != 0) {
            FD = n % 10;  
            n /= 10;
        }
        int sum = FD + LD;
        int prod = FD * LD;
        int res = sum + prod;
        if (res == originalN) {  
            System.out.println(originalN);
        } else {
            System.out.println("NO");
        }
    }
}
