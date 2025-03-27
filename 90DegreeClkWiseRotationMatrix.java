2D Array 90-Degree ClockWise Rotation
Sample input : n = 3
               1 2 3
               4 5 6
               7 8 9

Output : 7 4 1
         8 5 2
         9 6 3

CODE :

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] Mat = new int[n][n];
        // Matrix input using for loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Mat[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap Mat[i][j] and Mat[j][i] (Transpose)
                int temp = Mat[i][j];
                Mat[i][j] = Mat[j][i];
                Mat[j][i] = temp;
            }
        }
        // Introduction of k variable For Swapping Row and Column elements

        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = Mat[i][j];
                Mat[i][j] = Mat[i][k];
                Mat[i][k] = temp;
            }
        }

        // Printing the resultant 90-degree ClockWise Rotation Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
