// Reverse each word of a string

CODE :

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        String rev = "";
        for(int i=word.length-1;i>=0;i--){
            rev += word[i]+" ";
        }
        System.out.println(rev);
    }
}
