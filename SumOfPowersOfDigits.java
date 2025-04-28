Sum of Powers of digits in a number
Input : n=582109
Output : 390693 -> (5^8 + 8^2 + 2^1 + 1^0 + 0^9 + 9^0)

CODE :
import java.util.*;
public class SumOfPowersOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int bit = 0;
        int a = 0;
        int digit = 0;
        while(n>0){
            a = digit;
            digit = n%10;
            bit = (int) Math.pow(digit,a);
            sum += bit;
            n/=10;
        }
        System.out.print("Digit sum is : "+sum);
    }
}
