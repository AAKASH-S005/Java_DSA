// Zig-Zag Pattern Addition of the Matrix

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] Mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Mat[i][j] = sc.nextInt();
            }
        } 
        if (r == c) {
            int Sum = 0;
            for (int j = 0; j < c; j++) {
                Sum += Mat[0][j];
            }
            for (int i = 1; i < r - 1; i++) {
                Sum += Mat[i][i];
            }
            for (int j = 0; j < c; j++) {
                Sum += Mat[r - 1][j];
            }
            System.out.println("Sum of Zig-Zag pattern is " + Sum);
        } 
        else {
            System.out.println("Zig-Zag pattern calculation is only applicable for square matrices.");
        }
    }
}
