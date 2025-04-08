Code to print whether a Matrix is an Upper triangular matrix or Not

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
        int flag = 0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i][j]!=0){
                    flag++;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
        if(flag==0){
            System.out.print("Upper triangular matrix");
        }
        else{
            System.out.print("Not an Upper triangular matrix");
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Code to print whether a Matrix is lower triangular matrix or not

CODE :

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int flag = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                if(arr[i][j]!=0){
                    flag++;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
        }
        if(flag == 0){
            System.out.print("Lower triangular matrix");
        }
        else{
            System.out.print("Not a lower triangular matrix");
        }
    }
}
