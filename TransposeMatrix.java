Transpose of a Matix using Java

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] Mat = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(Mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
