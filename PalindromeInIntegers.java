Palindrome in Integers

CODE :

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0;
        int t=n;
        while(t>0){
            b=b+(t%10);
            b=b*10;
            t=t/10;
        }
        b=b/10;
        if(n==b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Using for loop
CODE :
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int rev = 0;
        for(int i=m;i>0;i/=10){
            int digit = i%10;
            rev = rev*10+digit;
        }
        if(m == rev){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
