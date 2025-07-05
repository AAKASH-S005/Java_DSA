// You are given a String S, you need to find the length of the Longest
// Contiguous substring that has atmost 2 distinct characters

import java.util.*;
public class LongSubString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        int maxLen = 0;
        int count = 0;
        int left = 0;
        int distinct = 0;
        int[] freq = new int[256];
        for(int right=0;right<n;right++){
            char ch = S.charAt(right);
            if(freq[ch]==0){
                distinct++;
            }
            freq[ch]++;
            while(distinct > 2){  // At most 2 Distinct Characters
                char leftChar = S.charAt(left);
                freq[leftChar]--;
                if(freq[leftChar] == 0){
                    distinct--;
                }
                left++;
            }
            int windowLen = right-left+1;
            if(windowLen > maxLen){
                maxLen = windowLen;
            }
        }
        System.out.print("Length of the Longest Substring is "+maxLen);
    }
}
