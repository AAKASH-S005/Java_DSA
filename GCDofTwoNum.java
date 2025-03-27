Java Program to find the GCD(Greatest Common Divisor)of  two numbers using Recursion
    // Euclidian Algorithm

CODE :

import java.io.*;
import java.util.*;

public class Solution {
    public static int gcd(int n1,int n2){
        if(n1 == 0)
            return n2;
        return gcd(n2%n1 ,n1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
