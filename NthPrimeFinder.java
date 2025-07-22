Java code to find the Nth prime number
CODE:
import java.io.*;
import java.util.*;
public class NthPrimeFinder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result = NthPrime(num);
        System.out.println("Nth prime number is "+result);
    }
    public static int NthPrime(int input){
        int count = 0;
        for(int i=2;i>0;i++){
            int flag = 0;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                count++;
            }
            if(count == input){
                return i;
            }
        }
        return 0;
    }
}
