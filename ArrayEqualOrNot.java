To Compute whether the two Arrays are Equal or Not

CODE :

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        if(n1 == n2){
            int c = 0;
            for(int i=0;i<n1;i++){
                if(arr1[i] == arr2[i]){
                    c++;
                }
                else{
                    break;
                }
            }
            
            if(c==n1){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
