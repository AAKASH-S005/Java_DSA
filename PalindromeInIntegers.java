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
