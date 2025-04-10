First Non-repeating character in String

CODE :

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int n=s.length();
        int f=0;
        for(int i=0;i<n;i++){
            f=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                   if(ch[i]==ch[j]){
                        f++;
                       break;
                    }
               }
            }
            if(f==0){
                System.out.print(ch[i]);
                break;
            }
        }
        if(f!=0){
            System.out.println("All the characters are repetitive");
        }
    }
}
