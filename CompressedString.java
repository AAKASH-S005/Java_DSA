Java code for compressed string
Input : "abbccddddeeeee"
Output : a1b2c3d4e5

CODE :
import java.util.*;
public class CompressedString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String out = "";
        int l = s.length();
        int count = 1;
        for(int i=1;i<l;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                out += s.charAt(i-1)+String.valueOf(count);
                count = 1;
            }
        }
        out += s.charAt(l-1)+String.valueOf(count);
        System.out.print(out);
    }
}
