Strings - Remove all characters in Second String that are present in First String

CODE :

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i = 0; i < len2; i++) {
            char currentChar = str2.charAt(i);
            int f = 0;
            for (int j = 0; j < len1; j++) {
                if (currentChar == str1.charAt(j)) {
                    f = 1;
                    break;  
                }
            }
            if (f==0) {
                System.out.print(currentChar);
            }
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

CODE :

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine(); 
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int i = 0;
        while (i < ch1.length && i < ch2.length && ch1[i] == ch2[i]) {
            i++;
        }
        if (i == ch1.length) {
            for (int j = i; j < ch2.length; j++) {
                System.out.print(ch2[j]);
            }
        } 
    }
}
