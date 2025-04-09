Code to check whether two Strings are Equal or not

CODE :

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        int l1 = input1.length();
        String input2 = sc.next();
        int l2 = input2.length();
        char[] ch1 = input1.toCharArray();
        char[] ch2 = input2.toCharArray();
        int flag = 0;
        if(l1==l2){
            for(int i=0;i<l1;i++){
                if(ch1[i] != ch2[i]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print("Both are Equal");
            } else{
                System.out.print("Both are not Equal");
            }
        }
        else{
            System.out.print("Both are not Equal");
        }
    }
}
