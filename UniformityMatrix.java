Uniformity Matrix in Java (2D Array) -> Uniformity matrix is a matrix in which the elements inside the matrix musyt be in all odd or all even but not both

Input : N=3 (both rows and columns)
        1 3 5      |   2 4 6
        7 9 11     |   8 10 12
        13 15 17   |   14 16 18

Output : Yes

CODE :

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int a=0,b=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2==0){
                    a++;
                }
                else if(arr[i][j]%2 == 1){
                    b++;
                }
            }
        }
        if(a==(n*n)){
            System.out.println("Yes");
        }
        else if(b==(n*n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
