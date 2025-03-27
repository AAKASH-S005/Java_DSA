Recursion -> Decimal to Binary in java

CODE :

import java.io.*;
import java.util.*;
public class Solution {
    static int binaryfind(int n){
        if(n == 0){
            return 0;
        }
        return n%2+(10*binaryfind(n/2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binaryfind(n));
    }
}
