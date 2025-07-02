Decimal to Binary Conversion in Java
CODE :
import java.util.*;
public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Value : ");
        int num = sc.nextInt();
        int n = num;
        String binary = "";
        while(num > 0){
            binary = (num%2)+binary;
            num = num/2;
        }
        System.out.println("Binary Value of "+n+" is "+binary);
    }
}
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
Binary to Decimal Conversion in Java
CODE :
import java.util.*;
public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Value : ");
        String binary = sc.next();
        int decimal = 0,base = 1;
        for(int i=binary.length()-1;i>=0;i--){
            decimal += (binary.charAt(i)-'0')*base;
            base *= 2;
        }
        System.out.println("Binary to Decimal : "+decimal);
    }
}
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
