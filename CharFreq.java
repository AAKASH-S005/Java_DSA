Input : "JAVA"
Output : 2351 (Ascii_sum Frequency Ascii_sum Frequency)
CODE:
import java.util.*;
public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        char[] ch = in.toCharArray();
        int[] arr = new int[in.length()];
        for (int i = 0; i < in.length(); i++) {
            int num = (int) ch[i];
            while (num >= 10) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
            }
            arr[i] = num;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] freq = new int[max + 1];
        for (int val : arr) {
            freq[val]++;
        }
        HashSet<Integer> printed = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!printed.contains(arr[i])) {
                System.out.print(arr[i]+""+freq[arr[i]]+"");
                printed.add(arr[i]);
            }
        }
    }
}
