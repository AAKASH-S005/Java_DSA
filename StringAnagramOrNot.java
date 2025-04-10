Write a program to find whether the given string is the anagram of the first string.

CODE :

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()==s2.length()){
            char c1[]=s1.toCharArray();
            char c2[]=s2.toCharArray();
            int fa1[]=new int[256];
            int fa2[]=new int[256];
            for(int i=0;i<s1.length();i++){
                int ascii=(int)c1[i];
                fa1[ascii]++;
                ascii=(int)c2[i];
                fa2[ascii]++;
            }
            int f=0;
            for(int i=0;i<256;i++){
                if(fa1[i]!=fa2[i]){
                    f=1;
                    break;
                }
            }
            if(f==1){
                System.out.println("Not Anagram");
            }
            else{
                System.out.println("Anagram");
            }
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
