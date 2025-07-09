Java code to find the Permutations of a String
CODE :
import java.util.*;
public class StrPermutations {
    public static void printPermutn(String s , String ans){
        if(s.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String ros = s.substring(0,i) + s.substring(i+1);
            printPermutn(ros,ans+ch);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        printPermutn(s,"");
    }
}
