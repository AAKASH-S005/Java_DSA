Code to print the Sum of two Matrix (2D Array)

CODE :

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int SumArr[][] = new int[r1][c1];
        if((r1==r2) && (c1==c2)){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    SumArr[i][j] = arr1[i][j]+arr2[i][j];
                }
            }
        }
        System.out.println("Sum of two Array elements : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(SumArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Code to print Subtraction of two Matrix (2D Array)

CODE :

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int SubArr[][] = new int[r1][c1];
        if((r1==r2) && (c1==c2)){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    SubArr[i][j] = arr1[i][j]-arr2[i][j];
                }
            }
        }
        System.out.println("Subtraction of two Array elements : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(SubArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
