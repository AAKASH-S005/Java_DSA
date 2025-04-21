TIC TAC TOE in java -> user inputs the number and prints its index
input : n = 5;
output : 1,1;

CODE :
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(a[i][j] == n){
                    System.out.print(i+" "+j);
                    return;
                } 
                else{
                    System.out.print("No element found");
                    return;
                }
            }
        }
    }
}
