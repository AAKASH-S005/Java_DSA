// Finding the length of the longest substring that has unique characters
// (no Duplicates)
import java.util.*;
public class SubString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int left = 0,right = 0;
        int maxLen = 0;
        int[] freq = new int[256];
        while(right < l){
            char ch = s.charAt(right);
            freq[ch]++;
            while(freq[ch] > 1){
                freq[s.charAt(left)]--;
                left++;
            }
            int len = right - left + 1;
            if(len > maxLen){
                maxLen = len;
            }
            right++;
        }
        System.out.print("Longest SubString length is "+maxLen);
    }
}
